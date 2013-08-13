/*
 * UserForm.java
 *
 * Created on May 15, 2007, 11:09 PM
 */



package com.myapp.web;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorActionForm;

//~--- JDK imports ------------------------------------------------------------

import javax.servlet.ServletRequest;

/**
 *
 * @author hantsy
 * @version
 */
public class UserForm extends ValidatorActionForm {
    private boolean agreeToPublic = false;
    private String  birthday;
    private String  confirmPassword;
    private String  email;
    private String  gender;
    private String  password;
    private String  username;

    @Override
    public void reset(ActionMapping arg0, ServletRequest arg1) {
        super.reset(arg0, arg1);
        agreeToPublic = false;
    }

    public boolean isAgreeToPublic() {
        return agreeToPublic;
    }

    public void setAgreeToPublic(boolean agreeToPublic) {
        this.agreeToPublic = agreeToPublic;
    }

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
