package com.siyuan.controller;


import com.siyuan.service.myService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

@Controller
public class myController {
    public void setMyService(myService myService) {
        this.myService = myService;
    }

    /**
     * simulate the client performance
     */
    @Autowired
    private myService myService;
    public String service(Double Score){
       return myService.doService(Score);
    }
}
