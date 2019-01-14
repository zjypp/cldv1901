package com.zjy.sericefeign.clients;

import org.springframework.stereotype.Component;

@Component
public class UserServiceClientHystic implements  UserServiceClient {
    @Override
    public String getIndex(String name) {
        return "sorry user-service is not used";
    }
}
