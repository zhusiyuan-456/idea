package com.siyuan.controller;

import com.siyuan.entity.User;
import com.siyuan.entity.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class helloHandler {
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index(@RequestParam("num") Integer id, @RequestParam("str") String name) {
        System.out.println("received request:" + "id=" + id + "name=" + name);
        return "index";
    }

    @RequestMapping("/restful/{id}/{name}")
    public String restful(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println(id + "-" + name);
        return "forward:/ index.jsp";
    }

    @RequestMapping("/cookie")
    public String getCookie(@CookieValue("JSESSIONID") String SessionID) {
        System.out.println(SessionID);
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(User user) {
        return user.toString();
    }

    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(@RequestParam(value = "id", required = true, defaultValue = "0") Integer id) {
        return "id" + id;
    }
    @RequestMapping("/arrayType")
    @ResponseBody
    public String arrayType(String[] names){
        StringBuffer stringBuffer=new StringBuffer();
        for (String str:names){
            stringBuffer.append(str).append(" ");
        }
        return "names"+stringBuffer.toString();
    }
    @RequestMapping("/listType")
    @ResponseBody
    public String listType(UserList userList){
        StringBuffer  sb=new StringBuffer();
        for(User user:userList.getUsers()){
            sb.append(user);
        }
        return " "+sb.toString();
    }



}
