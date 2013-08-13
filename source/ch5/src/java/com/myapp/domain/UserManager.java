/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.domain;

import java.util.List;

/**
 *
 * @author hantsy
 */
public interface UserManager {

    public boolean authenticateUser(String username, String password);

    public void registerUser(User user);
    
    public List<User> getAllUsers();
}
