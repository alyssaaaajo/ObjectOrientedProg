/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vehicleproject;

/**
 *
 * @author USER
 */
public class VehicleProject {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.setTopSpeed(100);
        car1.setColour("Blue");
        car1.setModel("Model 1");
        car1.setManufacturer("Tesla");
        car1.setPlateNumber("XYZ123");

        Vehicle car2 = new Vehicle("Model 2", "DEF456");
        car2.setTopSpeed(150);
        car2.setColour("Green");

        Vehicle car3 = new Vehicle(200, "Red", "Model 3", "Tesla", "ABC123");


        car1.display();
        while (car1.accelerate()) {}
        System.out.println();
        car1.fix();
        System.out.println();
        while (car1.getCurrentSpeed() <= 30) {
            car1.accelerate();
        }
        System.out.println();
        car1.decelerate();
        car1.decelerate();
        System.out.println();
        car1.fix();

        car3.display();
        while (car3.accelerate()) {}
        System.out.println();
        car3.fix();
        System.out.println();
        while (car3.getCurrentSpeed() <= 30) {
            car3.accelerate();
        }
        System.out.println();
        car3.decelerate();
        car3.decelerate();
        System.out.println();
        car3.fix();
    }
}