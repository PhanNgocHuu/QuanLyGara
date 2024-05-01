/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author KHANH
 */
public class Product {
    public String nameProduct;
    public  int quantity;
    public  float price;
    public  float pricesale;
    public  String size;
    public  String coler;
    public  String img_Product;
    public  String note;
    public String ID_TypeProduct;

    public Product(String nameProduct, int quantity, float price, float pricesale, String size, String coler, String img_Product, String note, String ID_TypeProduct) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
        this.pricesale = pricesale;
        this.size = size;
        this.coler = coler;
        this.img_Product = img_Product;
        this.note = note;
        this.ID_TypeProduct = ID_TypeProduct;
    }

    public Product() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
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

    public float getPricesale() {
        return pricesale;
    }

    public void setPricesale(float pricesale) {
        this.pricesale = pricesale;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public String getImg_Product() {
        return img_Product;
    }

    public void setImg_Product(String img_Product) {
        this.img_Product = img_Product;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getID_TypeProduct() {
        return ID_TypeProduct;
    }

    public void setID_TypeProduct(String ID_TypeProduct) {
        this.ID_TypeProduct = ID_TypeProduct;
    }
    
}
