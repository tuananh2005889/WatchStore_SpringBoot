package com.Watch_Shop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String machineType;
    private String description;
    private String strap;
    private String glassSurface;
    private String caseDiameter;
    private String waterResistance;
    private String caseMaterial;
    private String oscillation_frequency;
    private String powerReserve;
    private double price;
    private String image;
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStrap() {
        return strap;
    }

    public void setStrap(String strap) {
        this.strap = strap;
    }

    public String getGlassSurface() {
        return glassSurface;
    }

    public void setGlassSurface(String glassSurface) {
        this.glassSurface = glassSurface;
    }

    public String getCaseDiameter() {
        return caseDiameter;
    }

    public void setCaseDiameter(String caseDiameter) {
        this.caseDiameter = caseDiameter;
    }

    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public String getCaseMaterial() {
        return caseMaterial;
    }

    public void setCaseMaterial(String caseMaterial) {
        this.caseMaterial = caseMaterial;
    }

    public String getOscillation_frequency() {
        return oscillation_frequency;
    }

    public void setOscillation_frequency(String oscillation_frequency) {
        this.oscillation_frequency = oscillation_frequency;
    }

    public String getPowerReserve() {
        return powerReserve;
    }

    public void setPowerReserve(String powerReserve) {
        this.powerReserve = powerReserve;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
