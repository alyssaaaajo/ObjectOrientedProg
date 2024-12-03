/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version004;

/**
 *
 * @author USER
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private double ratePerPiece;
    
    public PieceWorkerEmployee() {}
    
    public PieceWorkerEmployee(int empID, Name empName) {
        super(empName, empID);
    }
    
    public PieceWorkerEmployee(int empID, Name empName, Date birthDate, Date startDate) {
        super(empID, empName, birthDate, startDate);
    }
    
    public PieceWorkerEmployee( int empID, Name empName, Date birthDate, Date startDate, int totalPiecesFinished, double ratePerPiece) {
        this(empID, empName, birthDate, startDate);
        this.totalPiecesFinished=  totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        double salary;
        salary = (this.totalPiecesFinished * this.ratePerPiece) + ((this.totalPiecesFinished/100) * (this.ratePerPiece * 10));
        return salary;
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nPieceWorkerEmployee:\n");
        str.append("totalPiecesFinished: ").append(totalPiecesFinished);
        str.append(", ratePerPiece: ").append(ratePerPiece);
        return str.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("\nTotal Pieces Finished: %d\n", totalPiecesFinished);
        System.out.printf("Rate Per Piece: %.2f\n", ratePerPiece);
        System.out.printf("Salary: %.2f\n",computeSalary());
    }
}
