package com.xxx.xxx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by windwant on 2017/4/28.
 */
@RestController
@RequestMapping("/app")
public class AppController {

    @RequestMapping("/test")
    public String test(){
        return "/app/test";
    }

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/abc")
    public String vtest(){
        return String.valueOf(port);
    }
}
