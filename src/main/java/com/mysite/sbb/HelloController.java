package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
//    @ResponseBody
    public String hello() {
        return "hello";
    }
    
    @GetMapping("/event")
    public String event() {
    	String filename = "myevent";
    	
    	return filename;
    }
}
