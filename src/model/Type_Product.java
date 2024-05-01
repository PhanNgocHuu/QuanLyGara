/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author KHANH
 */
public class Type_Product {
    public String id_TypeProduct;
    public  String name_Product;
    public  boolean  role_Product;

    public Type_Product() {
    }

    public Type_Product(String id_TypeProduct, String name_Product, boolean role_Product) {
        this.id_TypeProduct = id_TypeProduct;
        this.name_Product = name_Product;
        this.role_Product = role_Product;
    }

    public String getId_TypeProduct() {
        return id_TypeProduct;
    }

    public void setId_TypeProduct(String id_TypeProduct) {
        this.id_TypeProduct = id_TypeProduct;
    }

    public String getName_Product() {
        return name_Product;
    }

    public void setName_Product(String name_Product) {
        this.name_Product = name_Product;
    }

    public boolean isRole_Product() {
        return role_Product;
    }

    public void setRole_Product(boolean role_Product) {
        this.role_Product = role_Product;
    }
    
}
