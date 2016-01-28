package com.gmail.lan;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("url")
public class UrlTest {

    @RequestMapping("url")
    public String url(){
    	return "url url";
    }
    
    @RequestMapping("home")
    String home() {
        return "url home";
    }

}
