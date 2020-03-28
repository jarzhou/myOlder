package com.both.older.controller;


import com.both.older.entity.OlderEntity;
import com.both.older.service.Impl.OlderServiceImpl;
import com.both.older.service.interfaces.OlderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/older")
public class OlderController {
    @Resource
    private OlderService olderService;

    @GetMapping("/get")
    public String getOlder(){
        System.out.println(olderService.findAllOlder());
        return "ok";
    }

}
