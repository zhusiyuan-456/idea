package com.siyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloHandler {
    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(@RequestParam("num") Integer id,@RequestParam("str") String name){
        System.out.println("received request:"+"id="+id+"name="+name);
        return "index";
    }
    @RequestMapping("/index/{id}/{name}")
    public String restful(@PathVariable("id") Integer id,@PathVariable("name") String name){
        
    }
}
