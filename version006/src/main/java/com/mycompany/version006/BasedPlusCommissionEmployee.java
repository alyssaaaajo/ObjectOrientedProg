/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version006;
/**
 *
 * @author USER
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasedPlusCommissionEmployee() {}
    
    public BasedPlusCommissionEmployee(int empID, Name empName) {
        super(empID, empName);
    }
    
    public BasedPlusCommissionEmployee(int empID, Name empName, Date birthDate, Date startDate) {
        super(empID, empName, birthDate, startDate);
    }
    
    public BasedPlusCommissionEmployee(CommissionEmployee e){
        super(e.getEmpID(), e.getEmpName(), e.getBirthDate(), e.getStartDate(), e.getTotalSales());
    }
    
    public BasedPlusCommissionEmployee(CommissionEmployee e, double baseSalary){
        this(e.getEmpID(), e.getEmpName(), e.getBirthDate(), e.getStartDate(), e.getTotalSales(), baseSalary);
    }
    
    public BasedPlusCommissionEmployee(int empID,  Name empName, Date birthDate, Date startDate, double baseSalary, double totalSales) {
        super(empID,empName,birthDate,startDate,totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
   
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nBasedPlusComissionEmployee:\n");
        str.append("baseSalary: ").append(baseSalary);
        return str.toString();
    }
    
    @Override
    public void display(){
        this.empName.display();
        System.out.printf("Birth Date: ");
        this.birthDate.display();
        System.out.printf("  Start Date: ");
        this.startDate.display();
        System.out.printf("\nSalary: %.2f\n",computeSalary());
    }
}
