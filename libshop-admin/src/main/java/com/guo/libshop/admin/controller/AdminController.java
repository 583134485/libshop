package com.guo.libshop.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AdminController {

    /*跨域*/
    @RequestMapping(value="/test")
    @ResponseBody
    public String query(){
        return "query api ready";
    }


}
