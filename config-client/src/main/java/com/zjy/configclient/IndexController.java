package com.zjy.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/getconfig",method =RequestMethod.GET)
    public String getConfig(){
        return foo;
    }
}
