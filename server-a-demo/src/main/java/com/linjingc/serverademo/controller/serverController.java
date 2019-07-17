package com.linjingc.serverademo.controller;

import com.linjingc.serverademo.service.GoBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/a")
public class serverController {
    @Resource
    private GoBservice goBservice;

    /**
     * 本地请求
     * @return
     */
    @RequestMapping("/info")
    public String info(){
        return "本地A请求";
    }

    /**
     * 调用其他服务
     * @return
     */
    @RequestMapping("/goB")
    public String goB(){
        return goBservice.info();
    }

}
