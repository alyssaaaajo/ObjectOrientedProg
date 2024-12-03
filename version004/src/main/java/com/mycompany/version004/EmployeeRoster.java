/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version004;

/**
 *
 * @author USER
 */
public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int max;
    
    public EmployeeRoster() {
        this.max = 10;
        this.count = 0;
        empList = new Employee[max];
    }
    
    public boolean addEmployee(Employee e) {
        if(count < max) {
            empList[count++] = e;
            return true;
        }
        return false;
    }
    
    public Employee removeEmployee(int id) {
        for(int i=0; i < count; ++i) {
            if(empList[i].getEmpID() == id) {
                Employee temp = empList[i];
                for(int k = i; k < count; ++k) {
                    empList[k] = empList[k+1];
                }
                count--;
                return temp;
            }
        }
        return null;
    }
    
    public int countHE() {
        int countHE = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof HourlyEmployee) {
                countHE++;
            }
        }
        return countHE;
    }
    
    public int countCE() {
        int countCE = 0;
        for (int i = 0; i < count; ++i) {

            if (empList[i] instanceof BasedPlusCommissionEmployee) {

            } else {
                if (empList[i] instanceof CommissionEmployee) {
                    countCE++;
                }
            }
        }
        return countCE;
    }

    public int countBPCE() {
        int countBPCE = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof BasedPlusCommissionEmployee) {
                countBPCE++;
            }
        }
        return countBPCE;
    }

    public int countPWE() {
        int countPW = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                countPW++;
            }
        }
        return countPW;
    }

    public void displayHE() {
        for (int i = 0; i < count; ++i) {
            if (!(empList[i] instanceof HourlyEmployee)) {
            } else {
                ((HourlyEmployee) empList[i]).display();
            }
        }
    }

    public void displayCE() {
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof BasedPlusCommissionEmployee) {

            } else {
                if (empList[i] instanceof CommissionEmployee) {
                    ((CommissionEmployee) empList[i]).display();
                } else {
                }
            }
        }
    }

    public void displayBPCE() {
        for (int i = 0; i < count; ++i) {
            if (!(empList[i] instanceof BasedPlusCommissionEmployee)) {
            } else {
                ((BasedPlusCommissionEmployee) empList[i]).display();
            }
        }
    }

    public void displayPWE() {
        for (int i = 0; i < count; ++i) {
            if (!(empList[i] instanceof PieceWorkerEmployee)) {
            } else {
                ((PieceWorkerEmployee) empList[i]).display();
            }
        }
    }
    
    public void displayAllEmployee() {
        System.out.printf("%10s|%20s|%15s|%15s|%10s|%30s\n", "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
        for (int i = 0; i < count; ++i) {
            System.out.printf("%10s|", empList[i].getEmpID());
            System.out.printf("%20s|", empList[i].getEmpName());
            System.out.printf("%15s|", empList[i].getBirthDate());
            System.out.printf("%15s|", empList[i].getStartDate());
            if (empList[i] instanceof BasedPlusCommissionEmployee) {
                System.out.printf("%,10.2f|", ((BasedPlusCommissionEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof CommissionEmployee) {
                System.out.printf("%,10.2f|", ((CommissionEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof PieceWorkerEmployee) {
                System.out.printf("%,10.2f|", ((PieceWorkerEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof HourlyEmployee) {
                System.out.printf("%,10.2f|", ((HourlyEmployee) empList[i]).computeSalary());
            }
            System.out.printf("%30s|\n", empList[i].getClass().getSimpleName());
        }
        System.out.println();
    }
}
