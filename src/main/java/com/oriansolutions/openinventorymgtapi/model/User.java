package com.oriansolutions.openinventorymgtapi.model;



import javax.persistence.*;

/**
 * Created by madhawa on 11/19/17.
 */
@Entity
@Table(name="USER_DETAIL")
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name="USER_FIRST_NAME")
    private String firstName;
    @Column(name="USER_LAST_NAME")
    private String lastName;
    @Column(name="USER_PWD")
    private String password;
    @Column(name="LOGIN_ID")
    private String loginId;
    @Column(name="USER_EMAIL")
    private String email;

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

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
