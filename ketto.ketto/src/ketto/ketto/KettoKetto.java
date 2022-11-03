package ketto.ketto;

import static java.lang.System.out;
import java.util.Scanner;

public class KettoKetto {

    public static void main(String[] args) {
        Scanner bil = new Scanner (System.in);
        out.print("Mi a jelszó? ");
        String jelszo = bil.next();
        out.println("A beírt jelszó: " + jelszo + "\n");
        
        if(jelszo.equals("alma"))out.println("A jelszó helyes");
        else out.println("A jelszó helytelen");
        
        out.println("Konvertálás sztingből -" + Integer.valueOf("5756"));
        Integer a = 5;
        Integer b = 4;
        out.println("Összehasonéítás (nagyobbhoz a kisebbet): "+a.compareTo(b));
        out.println("Összehasonéítás (kisebbhez a bagyobbat): "+b.compareTo(a));
        out.println("Kisebb - " + Integer.min(a, b));
        out.println("Nagyobb - " + Integer.max(a, b));
        
        //ue floatban
        //hexa,okta,bin függvények
        
        
    }
    
}
