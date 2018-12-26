package org.logink.maque;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * <p>User: Yin Jidan
 * <p>Date: 17-5-27
 * <p>Version: 1.0 
 */   
@RestController  
@RequestMapping("/user")  
public class UserController2 {  
    @RequestMapping("/hello2")  
    public String hello() {  
        
        return "Hello World2";  
    }  
  
}  