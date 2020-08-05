package com.ol.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gyh
 * @create 2020-08-05 15:23
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "login";
    }


}

