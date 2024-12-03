/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version007;

/**
 *
 * @author USER
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;
    
    public HourlyEmployee() {}
    
    public HourlyEmployee(int empID, Name empName) {
        super(empName, empID);
    }
    
    public HourlyEmployee(int empID, Name empName, Date birthDate, Date startDate) {
        super(empID, empName, birthDate, startDate);
    }
    
    public HourlyEmployee(int empID, Name empName, Date birthDate, Date startDate, float totalHoursWorked, double ratePerHour) {
        super(empID, empName, birthDate, startDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    @Override
    public double computeSalary(){
        if (this.totalHoursWorked <= 40){
            return this.totalHoursWorked * this.ratePerHour;
        } else{
            return 40 * this.ratePerHour + ((this.totalHoursWorked - 40) * this.ratePerHour * 1.5);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nHourlyEmployee:\n");
        str.append("totalHoursWorked: ").append(totalHoursWorked);
        str.append(", ratePerHour: ").append(ratePerHour);
        return str.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public void display() {
        super.display();
        System.out.printf("\nTotal Hours Worked: %.2f\n", totalHoursWorked);
        System.out.printf("Rate Per Hour: %.2f\n", ratePerHour);
        System.out.printf("Salary: %.2f\n", computeSalary());
    }
}
