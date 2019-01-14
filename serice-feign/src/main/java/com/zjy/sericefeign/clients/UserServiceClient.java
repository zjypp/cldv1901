package com.zjy.sericefeign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 调用user-service的客户端封装
 */
@FeignClient(value = "user-service",fallback = UserServiceClientHystic.class)
public interface UserServiceClient {

    @RequestMapping(value ="/user/index",method = RequestMethod.GET)
    String getIndex(@RequestParam(value = "name") String name);
}
