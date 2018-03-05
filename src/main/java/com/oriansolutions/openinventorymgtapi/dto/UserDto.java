package com.oriansolutions.openinventorymgtapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

/**
 * Created by madhawa on 11/19/17.
 */
public class UserDto {
    private long Id;
    private String firstName;
    private String lastName;
    private String password;
    @JsonProperty(value="loginName")
    private String loginId;
    private String email;
    private String landPhoneNo;
    private String moilePhoneNo;
    private String personalAddress;

    public String getLandPhoneNo() {
        return landPhoneNo;
    }

    public void setLandPhoneNo(String landPhoneNo) {
        this.landPhoneNo = landPhoneNo;
    }

    public String getMoilePhoneNo() {
        return moilePhoneNo;
    }

    public void setMoilePhoneNo(String moilePhoneNo) {
        this.moilePhoneNo = moilePhoneNo;
    }

    public String getPersonalAddress() {
        return personalAddress;
    }

    public void setPersonalAddress(String personalAddress) {
        this.personalAddress = personalAddress;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDto)) return false;

        UserDto userDto = (UserDto) o;

        if (getId() != userDto.getId()) return false;
        if (!getFirstName().equals(userDto.getFirstName())) return false;
        return getLoginId().equals(userDto.getLoginId());

    }
    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLoginId().hashCode();
        return result;
    }

    // over riddent hashcode for inorder to check the equility of the objects
}
