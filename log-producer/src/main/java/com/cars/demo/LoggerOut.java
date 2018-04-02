package com.cars.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyunqi
 * @date 2018/03/27
 */
@RestController
public class LoggerOut {
    private static final Logger logger = LoggerFactory.getLogger(LoggerOut.class);
    @RequestMapping("/log")
    public String log(){
        for (int i = 0; i < 1000; i++) {
            logger.info("sssss");
        }
        return "hello";
    }
}
