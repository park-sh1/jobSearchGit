package com.example.jobsearch.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/main")
    public String Main(){

        System.out.println("확인 ::: ");
        return "/main/list";
    }
}
