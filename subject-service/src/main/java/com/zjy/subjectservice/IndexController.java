package com.zjy.subjectservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class IndexController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/index")
    public String index(@RequestParam(value = "name",defaultValue = "jason")String name ){
        return "hi "+name+",this is from user service which is from port："+port;
    }
}
