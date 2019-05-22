package com.ws.configclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    /**
     * 获取git配置文件信息
     */
    @Autowired
    private Environment environment;

    /**
     * 获取git配置文件信息
     */
    @Value("${test}")
    String value;

    @RequestMapping("/userName")
    public String userName(){
        return value;
    }

    @RequestMapping("/myName")
    public String myName(){
        return environment.getProperty("name","undefined");
    }

}
