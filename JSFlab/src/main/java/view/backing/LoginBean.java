/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author anna
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {
    private String username, password;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public String login() {
        if (username.equals(password)) {
            return "success";
        } else {
            return "failure";
        }
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
