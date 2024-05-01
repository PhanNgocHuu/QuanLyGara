/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author KHANH
 */
public class Users {
    public String username;
    public String password;
    public  boolean Role;

    public Users() {
    }

    public Users(String username, String password, boolean Role) {
        this.username = username;
        this.password = password;
        this.Role = Role;
    }

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

    public boolean isRole() {
        return Role;
    }

    public void setRole(boolean Role) {
        this.Role = Role;
    }
    
}
