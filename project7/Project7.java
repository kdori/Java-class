/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import static project7.Functions.fibonacci;
import static project7.Functions.printDelayedMessage;

/**
 *
 * @author kutas
 */
public class Project7 {

    public static void main(String[] args) throws DateOutOfBoundException, InvalidDayException {
        // TODO code application logic here
        try{
            int[] numbers= new int[100];
            System.out.println(numbers[10]);
            System.out.println(numbers[13/1]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Nincs ilyen indexű elem.");
        }catch(ArithmeticException ex){
            System.out.println("Nem lehet 0-val osztani.");
        }finally{
            System.out.println("Mindenképpen lefutó parancs.");
        }
         /*Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            System.out.println("Kérjem adjon meg egy számot!");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("A megadott szám: " + number);
        }finally{
            if(scanner!=null)
              scanner.close();  
        }*/
       
        try (Scanner scn = new Scanner(System.in)){
            System.out.println("Kérjem adjon meg egy számot!");
            int numb = scn.nextInt();
            scn.nextLine();
            System.out.print("A megadott szám: " + numb);
        }catch(InputMismatchException ex){
            System.out.println("Ez nem egy egész szám!");
        }
        
        //printDelayedMessage();
        
        
        
        
    }

   

 
    
}
