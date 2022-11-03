/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

/**
 *
 * @author kutas
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        String text = "Ez egy szöveg";
        System.out.println(text);
        String text2 = "Ez egy másik szöveg";
        System.out.println(text + " " + text2 + " " + text);
        System.out.println(text.toUpperCase());
        System.out.println(text);
        char kar = 'e';
        char myChar = '\u00DF';
        char myChar2 = '\u00CF';
        System.out.println(myChar+""+myChar2);
        System.out.printf("%c%c%n",myChar,myChar2);
        
        /*
        print();
        %c - char
        %s - string
        %d - decimal integer
        %f - float
        %t - date/time
        %n - sortörés
        */
        
        int myIntMax = Integer.MAX_VALUE + 1;
        int myIntMin = Integer.MIN_VALUE;
        
        System.out.println(myIntMax);
        System.out.println(myIntMin);
        
        String text3 = "Dóra";
        System.out.println(text3.repeat(100));
        
        String myName = "Dóra";
        System.out.println(myName.repeat(100));
        
        String myName2 ="!!!!!!!!!!!!!!!!!!!";
        System.out.println(myName2.replace("!"," Dóra Dóra Dóra Dóra Dóra "));
    }
    
}
