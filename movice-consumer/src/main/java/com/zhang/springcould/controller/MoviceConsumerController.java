package com.zhang.springcould.controller;

import com.zhang.springcould.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by YJ on 2018/1/19.
 */
@RestController
public class MoviceConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/query/{id}")
    public Teacher queryUserInfo(@PathVariable String id){
        String url = "http://localhost:8090/movice/";
        return this.restTemplate.getForObject(url+id,Teacher.class);
    }
}
