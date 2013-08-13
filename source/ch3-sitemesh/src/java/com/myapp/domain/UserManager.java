/*
 * UserManager.java
 *
 * Created on May 19, 2007, 8:07 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.myapp.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

/**
 *
 * @author hantsy
 */
public class UserManager {
    
    /** Creates a new instance of UserManager */
    public UserManager() {
    }
    
    public void createUser(User object) throws Exception {
        Context ctx=null;
        EntityManager em=null;
        UserTransaction utx=null;
        try {
            ctx=new InitialContext();
            em=(EntityManager)ctx.lookup("java:comp/env/persistence/LogicalName");
            utx=(UserTransaction)ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch(Exception e) {
            utx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,"exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
    public User getUserByUsername(String username) throws Exception{
        Context ctx=null;
        EntityManager em=null;
        try {
            ctx=new InitialContext();
            em=(EntityManager)ctx.lookup("java:comp/env/persistence/LogicalName");
            //utx=(UserTransaction)ctx.lookup("java:comp/env/UserTransaction");
            //utx.begin();
            return (User) em.createQuery("select u from User u where u.username=:username").setParameter("username",username).getSingleResult();
        } catch(Exception e) {
            //utx.rollback();
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,"exception caught", e);
            return null;
        }
    }
    
    public boolean authenticateUser(String username,String password)throws Exception{
        User user = getUserByUsername(username);
        if(user!=null&&password.equals(user.getPassword())){
            return true;
        }
        return false;
    }
    
    public boolean registerUser(User user)throws Exception{
        User _user = getUserByUsername(user.getUsername());
        if(_user!=null){
            return false;
        }
        this.createUser(user);
        return true;
    }


    
}
