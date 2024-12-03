/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version006;
/**
 *
 * @author USER
 */
public class CommissionEmployee extends Employee{
    public double totalSales;
    
    public CommissionEmployee() {}
    
    public CommissionEmployee(int empID, Name empName) {
        super(empName, empID);
    }
    
    public CommissionEmployee(int empID, Name empName, Date birthDate, Date startDate) {
        super(empID, empName, birthDate, startDate);
    }
    
    public CommissionEmployee(int empID, Name empName, Date birthDate, Date startDate, double totalSales) {
        super(empID, empName, birthDate, startDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    @Override
    public double computeSalary() {
        float rate;
        
        if (this.totalSales < 10000){
            rate = 0.05f;
        } else if (this.totalSales < 100000){
            rate = 0.1f;
        } else if (this.totalSales < 1000000){
            rate = 0.2f;
        } else{
            rate = 0.3f;
        }
        
        return this.totalSales * rate;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nComissionEmployee:\n");
        str.append("totalSales: ").append(totalSales);  
        return str.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("\nTotal Sales: %.2f\n", totalSales);
        System.out.printf("Salary: %.2f\n",computeSalary());// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
