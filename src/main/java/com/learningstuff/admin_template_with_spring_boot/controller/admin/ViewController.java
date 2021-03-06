package com.learningstuff.admin_template_with_spring_boot.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {


    @GetMapping(value = "")
    public ModelAndView indexView(ModelAndView modelAndView) {

        modelAndView.addObject("title", "AdminLET | Template");
        modelAndView.setViewName("admin/view/index");
        return modelAndView;
    }
}
