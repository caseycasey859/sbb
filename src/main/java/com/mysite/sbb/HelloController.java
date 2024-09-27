package com.mysite.sbb;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")   //요청이 왓을때
   @ResponseBody     //텍스트메시지를 보내는거   뿌려주는거111
    public String hello() {
        return "Hello World";
    }
   
  }
