package com.oriansolutions.openinventorymgtapi.controllers;

import com.oriansolutions.openinventorymgtapi.Service.UserService;
import com.oriansolutions.openinventorymgtapi.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by madhawa on 11/19/17.
 */
@RestController
public class UserRegistartionController {

    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userServiceObj;

    @RequestMapping(value = "/user/signup", method = RequestMethod.POST)
    public @ResponseBody UserDto create(@RequestBody UserDto userDto) throws Exception {
        userDto = userServiceObj.createUser(userDto);
        return userDto;
    }


    @RequestMapping(value = "/user/userinfo/{loginId}", method = RequestMethod.GET)
    public @ResponseBody UserDto readUserByLoginId(@PathVariable("loginId") String loginId) throws Exception {
        return userServiceObj.searchUserByLoginId(loginId);
    }
}
