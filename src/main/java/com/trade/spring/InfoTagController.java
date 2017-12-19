package com.trade.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;
import java.util.StringJoiner;

@Controller
@RequestMapping("/info")
public class InfoTagController {
    @RequestMapping("/helloHandler")
    @ResponseBody public String helloController(){
        return "hello";
    }

    @Autowired
    private WebApplicationContext webApplicationContext;
    private final static LocalDateTime startDateTime = LocalDateTime.now();
    @RequestMapping("/server")
    @ResponseBody
    public String infoTagServer(){
        return new StringJoiner("<br>").add("-------").add("server:"+
        webApplicationContext.getApplicationName()).add("time"+startDateTime).toString();
    }

}
