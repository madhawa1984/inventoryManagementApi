package com.oriansolutions.openinventorymgtapi.Dao;

import com.oriansolutions.openinventorymgtapi.model.User;

/**
 * Created by madhawa on 11/19/17.
 */
public interface UserDao {
    public User getUserById(long Id) throws Exception;
    public User getUserByLoginId(String loginId) throws Exception;
    public void createUser(User user) throws Exception;
    public void modifyUser(User user) throws Exception;
    public void dropUser(User user) throws Exception;
}

