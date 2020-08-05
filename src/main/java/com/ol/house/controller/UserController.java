package com.ol.house.controller;

import com.ol.house.mapper.UserMapper;
import com.ol.house.model.User;
import com.ol.house.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

/**
 * @author gyh
 * @create 2020-08-05 15:24
 */
@Controller
public class UserController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UserMapper userMapper;

    @PostMapping("/registry")
    public String registry(@RequestParam("username") String username, @RequestParam("password") String password, Model model){

        if("".equals(username) && "".equals(password)){
            model.addAttribute("msg","用户名密码不能为空");
            return "registry";
        }


        String salt = UUID.randomUUID().toString();
        String content = salt + password;
        String s = DigestUtils.md5DigestAsHex(content.getBytes());
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size()==0){
            User user = new User();
            user.setPassword(s);
            user.setUsername(username);
            user.setSalt(salt);
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(System.currentTimeMillis());
            userMapper.insertSelective(user);
            return "login";
        }else{
            model.addAttribute("msg","用户已被注册");
            return "registry";
        }

    }
    @GetMapping("/registry")
    public String toRigistry(){
        return "registry";
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        return null;
    }
}
