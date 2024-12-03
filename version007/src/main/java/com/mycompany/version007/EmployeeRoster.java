/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version007;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class EmployeeRoster {
    private ArrayList<Employee> empList;
    
    public EmployeeRoster() {
        empList = new ArrayList<>();
    }
    
    public boolean addEmployee(Employee e) {
        return this.empList.add(e);
    }
    
    public Employee removeEmployee(int id) {
        for (int i = 0; i < empList.size(); ++i){
            if (empList.get(i).getEmpID() == id){
                return empList.remove(i);
            }
        }
        return null;
    }
    
    public int countHE() {
        int countHE = 0;
        for (Employee e : empList) {
            if (e instanceof HourlyEmployee) {
                countHE++;
            }
        }
        return countHE;
    }
    
    public int countCE() {
        int countCE = 0;
        for (Employee e : empList) {
            if (e instanceof CommissionEmployee) {
                countCE++;
            }
        }
        return countCE;
    }

    public int countBPCE() {
        int countBCE = 0;
        for (Employee e : empList) {
            if (e instanceof BasedPlusCommissionEmployee) {
                countBCE++;
            }
        }
        return countBCE;
    }

    public int countPWE() {
        int countPE = 0;
        for (Employee e : empList) {
            if (e instanceof PieceWorkerEmployee) {
                countPE++;
            }
        }
        return countPE;
    }

    public void displayHE() {
    for (Employee e : empList) {
        if (e instanceof HourlyEmployee) {
            ((HourlyEmployee) e).display();
        }
    }
}

    public void displayCE() {
        for (Employee e : empList) {
            if (e instanceof CommissionEmployee && !(e instanceof BasedPlusCommissionEmployee)) {
                ((CommissionEmployee) e).display();
            }
        }
    }

    public void displayBPCE() {
        for (Employee e : empList) {
            if (e instanceof BasedPlusCommissionEmployee) {
                ((BasedPlusCommissionEmployee) e).display();
            }
        }
    }

    public void displayPWE() {
        for (Employee e : empList) {
            if (e instanceof PieceWorkerEmployee) {
                ((PieceWorkerEmployee) e).display();
            }
        }
    }

    public void displayAllEmployee() {
        System.out.printf("%10s|%20s|%15s|%15s|%10s|%30s\n", 
                          "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
        for (Employee e : empList) {
            System.out.printf("%10s|", e.getEmpID());
            System.out.printf("%20s|", e.getEmpName());
            System.out.printf("%15s|", e.getBirthDate());
            System.out.printf("%15s|", e.getStartDate());
            System.out.printf("%,10.2f|", e.computeSalary());
            System.out.printf("%30s|\n", e.getClass().getSimpleName());
        }
        System.out.println();
    }
}
