package com.zjy.sericefeign;

import com.zjy.sericefeign.clients.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    UserServiceClient userServiceClient;

    @RequestMapping("/index")
    public String index(@RequestParam String name){
        String result ="feign contrller :";
        for(int i=0;i<1000;i++){

            result +=userServiceClient.getIndex(name) + i +"<br/>";
        }


        return result;
    }

    @RequestMapping("/test")
    public String test1(){
        return "hello world";
    }
}
