/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mytime;

/**
 *
 * @author USER
 */
public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    public MyTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = (this.hours < 12) ? true : false;
    }
    
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isMeridian() {
        return meridian;
    }
    
    public void tickBySecond(){ 
        ++this.seconds;
        if (this.seconds > 59){
            this.tickByMinute();
            this.seconds = 0;
        }
    }
    
    public void tickByMinute(){
        ++this.minutes;
        if (this.minutes > 59){
            this.tickByHour();
            this.minutes = 0;
        } else {
            ++this.minutes;
        }
    }
    
    public void tickByHour(){
        ++this.hours;
        
        if(this.hours == 12){
            this.meridian = !this.meridian; 
        }
        
        if (this.hours == 24) {
            this.hours -= 24; 
            this.meridian = !this.meridian; 
        } 
        
    }      
    
    public void advanceTime(int seconds){
        this.seconds += seconds;
        int minuteRollover = this.seconds / 60;
        this.seconds %= 60;
        this.minutes += minuteRollover;
        int hourRollover = this.minutes / 60;
        this.minutes %= 60;
        this.hours += hourRollover;

        if (this.hours >= 24) {
            this.hours %= 24; 
        }

        
        if (this.hours == 0) {
            this.meridian = !this.meridian; 
        } else if (this.hours == 12) {
            this.meridian = !this.meridian; 
        } else if (this.hours > 12) {
            this.meridian = !this.meridian; 
        } else {
            this.meridian = true;  
        }
    }
    @Override
    public String toString() {
        
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, meridian);
    }
}