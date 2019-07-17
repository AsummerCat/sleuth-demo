package com.linjingc.serverbdemo.controller;

import com.linjingc.serverbdemo.service.GoBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class serverController {
    @Autowired
    private GoBservice goBservice;

    /**
     * 本地请求
     *
     * @return
     */
    @RequestMapping("/info")
    public String info() {
        return "本地B请求";
    }

    /**
     * 调用其他服务
     *
     * @return
     */
    @RequestMapping("/goB")
    public String goB() {
        return goBservice.info();
    }

}
