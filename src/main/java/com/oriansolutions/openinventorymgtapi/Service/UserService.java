package com.oriansolutions.openinventorymgtapi.Service;

import com.oriansolutions.openinventorymgtapi.dto.UserDto;

public interface UserService{
    public UserDto searchUserById(long Id) throws Exception;
    public UserDto searchUserByLoginId(String loginId) throws Exception;
    public UserDto createUser(UserDto user) throws Exception;
    public void modifyUser(UserDto user) throws Exception;
    public void dropUser(UserDto user) throws Exception;
}