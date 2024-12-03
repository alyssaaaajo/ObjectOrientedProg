/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.version004;

/**
 *
 * @author USER
 */
public class Name {
    public String fname;
    public String mname;
    public String lname;
    
    public Name(){}
    
    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }
    
    public Name(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
//        this.mname = "";
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(fname).append(" ");
        str.append(mname).append(" ");
        str.append(lname);     
        return str.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void display() {
        System.out.printf("%s, %s ", this.lname, this.fname);
        if (this.mname != null && !this.mname.equals("")){
            System.out.printf("%c.",this.mname.charAt(0));
        }
        System.out.printf("\n");
    }
}
