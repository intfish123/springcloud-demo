package com.intfish.userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("getUser")
    public String getUser(String id){
        log.info("user-service-1:"+id);
        return "user-service-1:"+id;
    }
}
