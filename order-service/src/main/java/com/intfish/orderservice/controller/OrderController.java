package com.intfish.orderservice.controller;

import com.intfish.orderservice.feign.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private UserService userService;

    @GetMapping("getOrder")
    public String getOrder(String id){
        log.info("order-service:"+id);
        String user = userService.getUser(id);
        log.info("调用user-service结果："+user);
        return "order-service:"+id + ", "+user;
    }
}
