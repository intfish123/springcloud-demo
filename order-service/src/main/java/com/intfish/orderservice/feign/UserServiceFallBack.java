package com.intfish.orderservice.feign;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBack implements UserService{
    @Override
    public String getUser(String id) {
        return "getUser服务器异常，请稍后再试";
    }
}
