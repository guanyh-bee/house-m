package com.ol.house.controller;

import com.ol.house.mapper.HouseMapper;
import com.ol.house.model.House;
import com.ol.house.model.HouseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author gyh
 * @create 2020-08-06 13:37
 */
@Controller
public class HouseController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    HouseMapper houseMapper;

    @GetMapping("/toAddHouse")
    public String toAdd(){
        return "addHouse";
    }
    @PostMapping("/addHouse")
    public String add(House house){
        houseMapper.insertSelective(house);
        return "redirect:/list";
    }
    @RequestMapping("/list")
    public String list(Model model){
        List<House> houses = houseMapper.selectByExample(new HouseExample());
        model.addAttribute("houses",houses);
        return "houseList";
    }

    @RequestMapping("/house/{id}")
    public String list(Model model, @PathVariable("id")Integer id){
        HouseExample houseExample = new HouseExample();
        houseExample.createCriteria().andIdEqualTo(id);
        List<House> houses = houseMapper.selectByExample(houseExample);
        model.addAttribute("house",houses.get(0));
        return "houseDetail";
    }
}
