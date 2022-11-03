//metódusok - osztályban lévő függvények, 
package harom;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class Harom {
    
    static Scanner bill = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.print("Kérem a játékosok számát ");
        int jatekos = bill.nextInt();
        int nyero = 0;
        int maxtipp = 10;
        for (int i = 0; i < jatekos; i++) {
            out.printf("Kérem az %d. játékost!", i+1);
            int n = tipp();
            if (maxtipp > n){
                nyero = i;
                maxtipp = n;
            }
        }
        out.printf("\nA %d. játékos nyert\n", nyero + 1);
        out.printf("Köszönöm a játékot!");
    }
    
    private static int tipp() {
        int tippek = 0;
        int RSzam = new Random().nextInt(10) + 1;
        
        out.print("Írj e egy számot 1 és 10 között: ");
        
        int beSzam = bill.nextInt();
        tippek++;
        
        while(beSzam != RSzam){
            out.println("Tippelj újra!");
            beSzam = bill.nextInt();
            tippek++;
        }
        out.printf("Eltaláltad! A tippjeid száma : %d\n",tippek);
        return tippek;
    }
    
}
