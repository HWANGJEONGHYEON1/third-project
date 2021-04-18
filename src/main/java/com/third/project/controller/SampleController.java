package com.third.project.controller;

import com.third.project.domain.SampleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/sample/*")
public class SampleController {
    private static final Logger log = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("")
    public void basic() {
        System.out.println("baisc....");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        System.out.println(dto.toString());
        return "ex01";
    }

    @GetMapping("ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println("name = " + name + ", age = " + age);
        return "ex02";
    }

}
