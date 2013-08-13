/*
 * LogonForm.java
 *
 * Created on May 15, 2007, 10:14 PM
 */

package com.myapp.web;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author hantsy
 * @version
 */

public class LogonForm extends org.apache.struts.action.ActionForm {
    private String username;
    private String password;
    
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
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUsername() == null || getUsername().length() < 1) {
            errors.add("name", new ActionMessage("error.username.required"));
            // TODO: add 'error.username.required' key to your resources
        }
        return errors;
    }
    
}
