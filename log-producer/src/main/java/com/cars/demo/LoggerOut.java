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
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/log")
    public String log(){
        logger.info("sssss");
        return "hello";
    }
}
