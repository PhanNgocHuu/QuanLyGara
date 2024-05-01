/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author KHANH
 */
public class Order_Detail {
    public int id_Order_Detail;
    public int id_Product;
    public int quantity;
    public float price;
    public String id_Order;

    public Order_Detail(int id_Order_Detail, int id_Product, int quantity, float price, String id_Order) {
        this.id_Order_Detail = id_Order_Detail;
        this.id_Product = id_Product;
        this.quantity = quantity;
        this.price = price;
        this.id_Order = id_Order;
    }

    public Order_Detail() {
    }

    public int getId_Order_Detail() {
        return id_Order_Detail;
    }

    public void setId_Order_Detail(int id_Order_Detail) {
        this.id_Order_Detail = id_Order_Detail;
    }

    public int getId_Product() {
        return id_Product;
    }

    public void setId_Product(int id_Product) {
        this.id_Product = id_Product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getId_Order() {
        return id_Order;
    }

    public void setId_Order(String id_Order) {
        this.id_Order = id_Order;
    }
    
}
