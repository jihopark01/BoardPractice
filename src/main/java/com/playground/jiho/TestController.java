package com.playground.jiho;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
//ex) /test/api
public class TestController {

    @GetMapping("/api")
    public Map<String,String> test(){
        return Map.of("result", "hello world");
    }

    @GetMapping("/getName")
    public Map<String,String> test1(){
        return Map.of("your name", "tamhoon");
    }
}
