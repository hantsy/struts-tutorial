/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hantsy
 */
public class DummyUserManagerImpl implements UserManager {

    static List<User> userList = new ArrayList<User>();

    static {
        User user1 = new User();
        user1.setEmail("test@tom.com");
        user1.setPassword("test");
        user1.setUsername("test");

        userList.add(user1);

        User user2 = new User();
        user2.setEmail("test2@tom.com");
        user2.setPassword("test2");
        user2.setUsername("test2");
        userList.add(user2);

        User user3 = new User();
        user3.setEmail("test3@tom.com");
        user3.setPassword("test3");
        user3.setUsername("test3");
        userList.add(user3);


        User user4 = new User();
        user4.setEmail("test4@tom.com");
        user4.setPassword("test4");
        user4.setUsername("test4");
        userList.add(user4);

        User user5 = new User();
        user5.setEmail("test2@tom.com");
        user5.setPassword("test2");
        user5.setUsername("test2");
        userList.add(user5);

    }

    public boolean authenticateUser(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getUsername().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void registerUser(User user) {
        userList.add(user);
    }
    
    public List<User> getAllUsers(){
        return userList;
    }
    
    
}
