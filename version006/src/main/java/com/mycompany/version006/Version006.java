/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version006;

/**
 *
 * @author USER
 */
public class Version006 {
    public static void main(String[] args) {
        HourlyEmployee e1 = new HourlyEmployee(101, new Name("Joanna", "S.", "Tacder"), new Date(05,02,2005), new Date(10,14,2024), 100, 50);
        PieceWorkerEmployee p1 = new PieceWorkerEmployee(102, new Name("Jennie", "M.", "Tacder"), new Date(07,22,2005), new Date(10,14,2024), 100, 50);
        CommissionEmployee s1 = new CommissionEmployee(103, new Name("Roronoa", "Zoro"), new Date(02,14,2004), new Date(10,14,2024), 1600);
        BasedPlusCommissionEmployee b1 = new BasedPlusCommissionEmployee(104, new Name("Kageyama", "Tobio"), new Date(01,21,2004), new Date(10,14,2024), 1800, 1200);
        
        HourlyEmployee e2 = new HourlyEmployee(105, new Name("Hinata", "E.", "Shoyo"), new Date(9,18,2005), new Date(10,14,2024), 100, 50);
        
        EmployeeRoster list = new EmployeeRoster();
        list.addEmployee(e1);
        list.addEmployee(p1);
        list.addEmployee(s1);
        list.addEmployee(b1);
        list.addEmployee(e2);
        
//        System.out.printf("Number of HE: %d", list.countHE());
//        System.out.printf("Number of PWE: %d", list.countPWE());
//        System.out.printf("Number of CE: %d", list.countCE());
//        System.out.printf("Number of BPCE: %d", list.countBPCE());
        
        list.displayAllEmployee();
    }
}
