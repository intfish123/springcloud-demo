package com.intfish.orderservice.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-service")
public interface UserService {
    @GetMapping("/user/getUser")
    String getUser(@RequestParam String id);
}
