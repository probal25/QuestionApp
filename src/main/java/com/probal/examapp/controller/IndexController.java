package com.probal.examapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String redirect() {
        return "redirect:/question/all_questions";
    }

    @RequestMapping("/error_view")
    public String error_view() {
        return "error";
    }
}
