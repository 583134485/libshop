package com.guo.libshop.cms.web.controller;

import com.guo.libshop.cms.search.api.DemoSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    DemoSearch demoSearch;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    String App(){
        return  "yes bady";
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    String Search(String s){
        return  demoSearch.DemoSearch(s);
    }
}
