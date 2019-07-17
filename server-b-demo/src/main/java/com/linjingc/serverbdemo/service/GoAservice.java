package com.linjingc.serverbdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("server-a-demo")
public interface GoAservice {

    @RequestMapping(value = "/a/info")
    String info();
}
