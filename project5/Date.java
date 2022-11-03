/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

/**
 *
 * @author kutas
 */
// osztály 101
public class Date {
    
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public Date(){
    }
    
    //METÓDUS   
    
    boolean isLeapYear(){
        boolean leapYear = false;
        if(year % 4 == 0 && year % 400 != 0 || year % 400 == 0)
            leapYear = true;
        return leapYear;
    }
    
    boolean isMonthValid(){
       return month >= 1 && month <= 12;
    }
    
    boolean isDayValid(){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return day >=1 && day<=31;
        else if(month == 2 && !isLeapYear())
            return day >= 1 && day<=29;
        else if(month == 2 && isLeapYear())
            return day >= 1 && day<=28;
        else 
            return day >=1 && day<=30;
                    
    }
    
    void incrementDay(int n){
        for (int i = 0; i < n; i++) {
            day += 1;
            if(isDayValid()){
                System.out.println(year + " " + month + " " + day + " ");
            }
            else{
                day -=1;
                month +=1;
                if (isMonthValid()){
                    day = 1; 
                }
                else{
                    month =1;
                    year +=1;
                    day = 1; 
                }
                System.out.println(year + " " + month + " " + day + " ");
            }
        }
    }
    void decrementDay(int n){
        for (int i = 0; i < n; i++) {
            day-=1;
            if(!isDayValid()){
                month--;
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                    day =31;
                else if(month == 2 && isLeapYear())
                    day =29;
                else if(month == 2 && !isLeapYear())
                    day =28;
                else
                    day = 30;
                
            }
            
            if(!isMonthValid()){
                day = 31;
                month = 12;
                year--;
            }
            System.out.println(year + " " + month + " " + day + " ");
        }
    }
    
    
}
