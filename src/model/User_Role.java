/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author KHANH
 */
public class User_Role {
    public int ID_User_Role;
    public  String full_Name;
    public  String BithDay;
    public  String Number_Phone;
    public  String Email;
    public String Avatar;
    public String Address;
    public Date Create_Day;
    public boolean gender;
    public boolean  Active;
    public  String username;

    public User_Role() {
    }

    public User_Role(int ID_User_Role, String full_Name, String BithDay, String Number_Phone, String Email, String Avatar, String Address, Date Create_Day, boolean gender, boolean Active, String username) {
        this.ID_User_Role = ID_User_Role;
        this.full_Name = full_Name;
        this.BithDay = BithDay;
        this.Number_Phone = Number_Phone;
        this.Email = Email;
        this.Avatar = Avatar;
        this.Address = Address;
        this.Create_Day = Create_Day;
        this.gender = gender;
        this.Active = Active;
        this.username = username;
    }

    public int getID_User_Role() {
        return ID_User_Role;
    }

    public void setID_User_Role(int ID_User_Role) {
        this.ID_User_Role = ID_User_Role;
    }

    public String getFull_Name() {
        return full_Name;
    }

    public void setFull_Name(String full_Name) {
        this.full_Name = full_Name;
    }

    public String getBithDay() {
        return BithDay;
    }

    public void setBithDay(String BithDay) {
        this.BithDay = BithDay;
    }

    public String getNumber_Phone() {
        return Number_Phone;
    }

    public void setNumber_Phone(String Number_Phone) {
        this.Number_Phone = Number_Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getCreate_Day() {
        return Create_Day;
    }

    public void setCreate_Day(Date Create_Day) {
        this.Create_Day = Create_Day;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
