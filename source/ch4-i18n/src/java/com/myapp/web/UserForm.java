/*
 * UserForm.java
 *
 * Created on May 15, 2007, 11:09 PM
 */

package com.myapp.web;

import org.apache.struts.validator.ValidatorActionForm;

/**
 *
 * @author hantsy
 * @version
 */

public class UserForm extends ValidatorActionForm {
    private String username;
    private String password;
    private String email;
    private String confirmPassword;
    private String birthday;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
