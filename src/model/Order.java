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
public class Order {
    public String id_Order;
    public  Date create_Day;
    public boolean  active;
    public float total_Price;
    public String number_Phone;
    public String Address;
    public String note;
    public String username;

    public Order(String id_Order, Date create_Day, boolean active, float total_Price, String number_Phone, String Address, String note, String username) {
        this.id_Order = id_Order;
        this.create_Day = create_Day;
        this.active = active;
        this.total_Price = total_Price;
        this.number_Phone = number_Phone;
        this.Address = Address;
        this.note = note;
        this.username = username;
    }

    public Order() {
    }

    public String getId_Order() {
        return id_Order;
    }

    public void setId_Order(String id_Order) {
        this.id_Order = id_Order;
    }

    public Date getCreate_Day() {
        return create_Day;
    }

    public void setCreate_Day(Date create_Day) {
        this.create_Day = create_Day;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public float getTotal_Price() {
        return total_Price;
    }

    public void setTotal_Price(float total_Price) {
        this.total_Price = total_Price;
    }

    public String getNumber_Phone() {
        return number_Phone;
    }

    public void setNumber_Phone(String number_Phone) {
        this.number_Phone = number_Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
