/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kutas
 */


public class Functions {
    static void printDelayedMessage(){
        System.out.println("Ez egy ");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("...üzenet");
    }
    
    static void reservedDay(int day) throws DateOutOfBoundException, InvalidDayException{
        if(day < 1 ||  day > 7){
            throw new DateOutOfBoundException("Ilyen nap nincs.");
        }
        if(day == 6 || day ==7){
            throw new InvalidDayException("Erre a napra nem lehet foglalni.");
        }
    }
    
    static int[] fibonacci(int n){
            int[] fn = new int[n];
            fn[0]=0;
            fn[1]=1;
            int m = 2;
            if(m < n){
                fn[m]=fn[m-1]+fn[m-2];
                m++;      
                fibonacci(n);
            }
            return fn;
    }
}
