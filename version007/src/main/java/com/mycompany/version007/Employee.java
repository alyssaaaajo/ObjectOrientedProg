/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version007;

/**
 *
 * @author USER
 */
 public abstract class Employee implements EmpInterface {
    public int empID;
    public Name empName;
    public Date birthDate;
    public Date startDate;
    
    public Employee() {}
    
    public Employee(Name empName, int empID) {
        this.empID = empID;
        this.empName = new Name(empName.fname, empName.mname, empName.lname);
    }
    
    public Employee(int empID, Name empName, Date birthDate, Date startDate) {
        this(empName, empID);
        this.birthDate = new Date(birthDate.getMonth(), birthDate.getDay(), birthDate.getYear());
        this.startDate = new Date(startDate.getMonth(), startDate.getDay(), startDate.getYear());
    }
    
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        str.append("empID: ").append(empID);
        str.append("\nempName: ").append(empName);
        str.append("\nbirthDate: ").append(birthDate);
        str.append("\nstartDate: ").append(startDate);
        
        return str.toString();
    }
    
    public void display(){
        this.empName.display();
        System.out.printf("Birth Date: ");
        this.birthDate.display();
        System.out.printf("  Start Date: ");
        this.startDate.display();
    }

}
