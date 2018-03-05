package com.oriansolutions.openinventorymgtapi.Service.imlp;

import com.oriansolutions.openinventorymgtapi.Dao.UserDao;
import com.oriansolutions.openinventorymgtapi.Service.UserService;
import com.oriansolutions.openinventorymgtapi.dto.UserDto;
import com.oriansolutions.openinventorymgtapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by madhawa on 11/19/17.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Qualifier("userServiceBean")
    @Autowired
    private UserDao userDaoObj;

    private User getUserfromDto(UserDto user) {
        User userObj = new User();
        userObj.setId(user.getId());
        userObj.setFirstName(user.getFirstName());
        userObj.setLastName(user.getLastName());
        userObj.setPassword(user.getPassword()); // password need to be encrypted
        // TODO:; password fields need to be non mutable avoid password MEMORY dump
        userObj.setLoginId(user.getLoginId());
        userObj.setEmail(user.getEmail());
        userObj.setLandPhoneNo(user.getLandPhoneNo());
        userObj.setMoilePhoneNo(user.getMoilePhoneNo());
        userObj.setPersonalAddress(user.getPersonalAddress());
        return userObj;
    }

    private UserDto getUserDtofromModel(User user) {
        UserDto userDtoObj = new UserDto();
        userDtoObj.setId(user.getId());
        userDtoObj.setFirstName(user.getFirstName());
        userDtoObj.setLastName(user.getLastName());
        userDtoObj.setLoginId(user.getLoginId());
        userDtoObj.setEmail(user.getEmail());
        userDtoObj.setLandPhoneNo(user.getLandPhoneNo());
        userDtoObj.setMoilePhoneNo(user.getMoilePhoneNo());
        userDtoObj.setPersonalAddress(user.getPersonalAddress());
        return userDtoObj;
    }

    public UserDto getUserById(long Id) throws Exception {
        User userObj = userDaoObj.getUserById(Id);
        return getUserDtofromModel(userObj);
    }

    @Override
    public UserDto searchUserById(long Id) throws Exception {
        return null;
    }

    @Override
    public UserDto createUser(UserDto user) throws Exception {
        User userData = getUserfromDto(user);
        userDaoObj.createUser(userData);
        System.out.println(userData.getId());
        user = getUserById(userData.getId());
        return user;

    }

    @Override
    public void modifyUser(UserDto user) throws Exception {

    }

    @Override
    public void dropUser(UserDto user) throws Exception {

    }
}
