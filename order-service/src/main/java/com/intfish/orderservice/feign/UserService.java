package com.intfish.orderservice.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserServiceFallBack.class)
public interface UserService {
    @GetMapping("/user/getUser")
    String getUser(@RequestParam String id);
}
