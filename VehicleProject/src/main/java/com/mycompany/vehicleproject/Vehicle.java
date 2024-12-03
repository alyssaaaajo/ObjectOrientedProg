/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicleproject;

/**
 *
 * @author USER
 */
public class Vehicle {
    private int topSpeed;
    private int current_speed;
    private String colour;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;

    public Vehicle() {
        this.current_speed = 0;
        this.disabled = false;
    }

    public Vehicle(String model, String plateNumber) {
        this.current_speed = 0;
        this.disabled = false;
        this.model = model;
        this.plateNumber = plateNumber;
    }

    public Vehicle(int topSpeed, String colour, String model, String manufacturer, String plateNumber) {
        this.topSpeed = topSpeed;
        this.current_speed = 0;
        this.colour = colour;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = false;
    }

    public int getCurrentSpeed() {
        return this.current_speed;
    }
    
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public String getModel() {
        return this.model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public boolean accelerate() {
        if (this.disabled || this.current_speed + 10 > this.topSpeed) {
            this.disabled = true;
            this.current_speed = 0;
            System.out.println("The vehicle is disabled.");
            return false;
        } else {
            this.current_speed += 10;
            System.out.println(String.format("The vehicle accelerated by 10 km/h and is now at %d km/h.", this.current_speed));
            return true;
        }
    }

    public boolean decelerate() {
        if (this.disabled) {
            System.out.println("The vehicle is disabled.");
            return false;
        } else {
            this.current_speed -= 5;
            if (this.current_speed < 0) {
                this.current_speed = 0;
            }
            System.out.println(String.format("The vehicle decelerated by 5 km/h and is now at %d km/h.", this.current_speed));
            return true;
        }
    }

    public void fix() {
        if (!this.disabled) {
            System.out.println("The vehicle is not broken.");
        } else {
            this.disabled = false;
            System.out.println("The vehicle is fixed.");
        }
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Colour: ").append(getColour()).append("\n");
        sb.append("Model: ").append(getModel()).append("\n");
        sb.append("Manufacturer: ").append(getManufacturer()).append("\n");
        sb.append("Plate Number: ").append(getPlateNumber()).append("\n");
        sb.append("Top Speed: ").append(this.topSpeed).append("\n");
        sb.append("Current Speed: ").append(this.current_speed).append("\n");
        return sb.toString();
    }
}