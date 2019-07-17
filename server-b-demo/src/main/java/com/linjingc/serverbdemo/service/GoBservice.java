package com.linjingc.serverbdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("server-b-demo")
public interface GoBservice {

    @RequestMapping(value = "info")
    String info();
}
