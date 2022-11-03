package project5;

import static project5.Function.printYourName;
import static project5.Function.quadraticFormulaReturn;
import static project5.Function.quadraticFormulaVoid;

/**
 *
 * @author kutas
 */
public class Project5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //quadraticFormulaVoid(1, 5, 4);
        //printYourName(100);
        Date date = new Date(2000, 10, 07);
       
        //System.out.println(date.isLeapYear());
        //System.out.println(date.getYear()+"."+date.getMonth()+"."+date.getDay());
        //date.incrementDay(365);
        date.decrementDay(365);
        
    }
    
}
