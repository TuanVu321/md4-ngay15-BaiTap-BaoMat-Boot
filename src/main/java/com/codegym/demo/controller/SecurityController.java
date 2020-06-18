package com.codegym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("home");
    }
    @GetMapping("/admin")
    public ModelAndView admin(){
        return new ModelAndView("admin");
    }
    @GetMapping("/user")
    public ModelAndView user(){
        return new ModelAndView("user");
    }
    @GetMapping("/404-error")
    public ModelAndView error(){
        return new ModelAndView("404-error");
    }
}
