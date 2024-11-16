package com.example;

public class Mobile extends Product {
    private String brand;
    private String os;

    public Mobile() {
    }

    public Mobile(String product_id, String product_name, double product_price, int product_total, String brand, String os) {
        super(product_id, product_name, product_price, product_total);
        this.brand = brand;
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "product_id='" + getProduct_id() + '\'' +
                ", product_name='" + getProduct_name() + '\'' +
                ", product_price=" + getProduct_price() +
                ", product_total=" + getProduct_total() +
                ", brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
