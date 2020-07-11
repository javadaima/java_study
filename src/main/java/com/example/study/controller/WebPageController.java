package com.example.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.Contended;

@Controller
@RequestMapping("/getPage")
public class WebPageController {

    @GetMapping("/")
    public String getPage(@RequestParam("page")String page){
        return page;
    }
}
