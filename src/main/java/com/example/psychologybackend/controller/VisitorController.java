package com.example.psychologybackend.controller;


import com.example.psychologybackend.entity.Visitor;
import com.example.psychologybackend.service.VisitorService;
import com.example.psychologybackend.utils.R;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author renu
 * @since 2023-05-26
 */
@RestController
@RequestMapping("/visitor")
public class VisitorController {


    @Autowired
    private VisitorService visitorService;
    @GetMapping("/profile")
    public R profile(@RequestParam("visitorId")Integer visitorId){
        Visitor visitor = visitorService.getById(visitorId);

        return R.ok(visitor);
    }

    @GetMapping("/hello")
    public R hello(){

        return R.ok("hello");
    }
}

