package com.github.vladislav719.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Vlad on 21.03.2015.
 */
@Controller
@RequestMapping("/")
public class MainController {


    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

}
