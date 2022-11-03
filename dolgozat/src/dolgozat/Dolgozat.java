package dolgozat;

import java.util.Scanner;

public class Dolgozat {

    public static void main(String[] args) {
        
        Integer szamok[] = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kérjük töltse fel a tömböt egész számokkal, nulla végjelig.");
        int i = 0;
            try{
                do{
                    szamok[i] = scan.nextInt();
                    i++;
                    System.out.println("Kérek egy új számot!");
                }
                while(szamok[i]!= 0);
            }
            catch(Exception ex){
                System.out.println(ex);
                System.out.println("A bevitt adat nem megfelelő! Prbálja újra!");
                szamok[i] = scan.nextInt();
            }
        System.out.println("Tömb feltöltése befejeződött.");
        System.out.println("A tömb elemei: ");
        for(Integer j : szamok){
            System.out.print(j + " ");
        }
        
        
    }
    
}
