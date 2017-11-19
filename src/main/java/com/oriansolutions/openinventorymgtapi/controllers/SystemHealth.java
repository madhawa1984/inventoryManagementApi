package com.oriansolutions.openinventorymgtapi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by madhawa on 11/5/17.
 */
@RestController
public class SystemHealth {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value="/systemHealthCheck")
    public String checkHealth() {
        logger.debug("This is a debug message");
        return "OK>>>";
    }
}
