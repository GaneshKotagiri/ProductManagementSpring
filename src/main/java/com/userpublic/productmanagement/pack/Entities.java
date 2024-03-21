package com.userpublic.productmanagement.pack;

import java.util.ArrayList;
import java.util.List;

public class Entities {
    private String Name;
    private String BrandName;
    private String CameraResolution;
    private int price;
    private String Battery;

    public Entities(String name, String brandName, String cameraResolution, int price, String battery) {
        Name = name;
        BrandName = brandName;
        CameraResolution = cameraResolution;
        this.price = price;
        Battery = battery;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getCameraResolution() {
        return CameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        CameraResolution = cameraResolution;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getBattery() {
        return Battery;
    }
    public void setBattery(String battery) {
        Battery = battery;
    }
    @Override
    public String toString() {
        return "Entities{" +
                "Name='" + Name + '\'' +
                ", BrandName='" + BrandName + '\'' +
                ", CameraResolution='" + CameraResolution + '\'' +
                ", price=" + price +
                ", Battery='" + Battery + '\'' +
                '}';
    }
}
