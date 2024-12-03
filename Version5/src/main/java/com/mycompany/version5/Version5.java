/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version5;

/**
 *
 * @author USER
 */
public class Version5 {

    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();
        roster.addEmployee(new HourlyEmployee(1, new Name("Roronoa", "Zoro"), new Date(1997, 1, 15), new Date(2024, 5, 10), 12.3f, 1.5));
        // roster.addEmployee(new HourlyEmployee(1, new Name("Doe", "John"), new Date(1997, 1, 15), new Date(2024, 5, 10), 12.3f, 1.5));
        roster.addEmployee(new CommissionEmployee(2, new Name("Tacder", "Joanna"), new Date(1997, 1, 15), new Date(2024, 5, 10), 100.15));
        roster.addEmployee(new BasePlusCommissionEmployee(3, new Name("Mondelo", "Alysssa", "Siangko"), 100.2, 50.0));
        roster.displayAllEmployees();
    }
}
