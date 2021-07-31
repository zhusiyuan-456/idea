package com.siyuan.entity;

public class Cars {
    private Integer num;
    private String brand;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Cars(Integer num, String brand) {
        this.num = num;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "num=" + num +
                ", brand='" + brand + '\'' +
                '}';
    }
}
