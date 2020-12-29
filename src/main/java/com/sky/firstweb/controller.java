package com.sky.firstweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
   

    @RequestMapping("/")
    public String index() {
        
        return "index";
    }
}
