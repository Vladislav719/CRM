package com.github.vladislav719.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vladislav on 29.04.2015.
 */
@Controller
@RequestMapping
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderIndexPage(ModelMap map) {
        return "/main/index";
    }
}
