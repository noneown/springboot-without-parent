package com.bootconfigtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class App {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/abc")
    public String test(){
        return String.valueOf(port);
    }
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
