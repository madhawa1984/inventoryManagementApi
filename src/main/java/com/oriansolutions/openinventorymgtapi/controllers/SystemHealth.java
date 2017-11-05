package com.oriansolutions.openinventorymgtapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by madhawa on 11/5/17.
 */
@RestController
public class SystemHealth {
    @RequestMapping(value="/systemHealthCheck")
    public String checkHealth() {
        return "OK>>>";
    }
}
