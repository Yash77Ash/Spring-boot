package com.spring.security.inmemoryauthentication.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PageController {

    @GetMapping("/")
    public ModelAndView home () {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping("/career")
    public ModelAndView career( ) {
        ModelAndView modelAndView = new ModelAndView("career");
        return modelAndView;
    }

    @GetMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView("about");
        return modelAndView;
    }

    @GetMapping("/logout/home")
    public ModelAndView logout() {
        ModelAndView modelAndView = new ModelAndView("logouthome");
        return modelAndView;
    }

}