package com.cucumber.rest.cucumberdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET,value = "/message")
    public String getMessage(){
        return "Hello World";
    }
}
