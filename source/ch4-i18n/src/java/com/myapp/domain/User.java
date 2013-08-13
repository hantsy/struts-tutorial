package com.myapp.domain;

//~--- JDK imports ------------------------------------------------------------

import java.io.Serializable;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */

/**
 *
 * @author hantsy
 */
public class User implements Serializable {
    private String email;
    private String password;
    private String username;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final User other = (User) obj;

        if ((this.username != other.username) && ((this.username == null) ||!this.username.equals(other.username))) {
            return false;
        }

        if ((this.password != other.password) && ((this.password == null) ||!this.password.equals(other.password))) {
            return false;
        }

        if ((this.email != other.email) && ((this.email == null) ||!this.email.equals(other.email))) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;

        hash = 79 * hash + ((this.username != null)
                            ? this.username.hashCode()
                            : 0);
        hash = 79 * hash + ((this.password != null)
                            ? this.password.hashCode()
                            : 0);
        hash = 79 * hash + ((this.email != null)
                            ? this.email.hashCode()
                            : 0);

        return hash;
    }
}
