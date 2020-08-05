package com.ol.house.controller;

import com.ol.house.mapper.UserMapper;
import com.ol.house.model.User;
import com.ol.house.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/registry")
    public String registry(@RequestParam("username") String username, @RequestParam("password") String password){
        String salt = UUID.randomUUID().toString();
        String content = salt + password;
        String s = DigestUtils.md5DigestAsHex(content.getBytes());
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);

        return "login";
    }
}
