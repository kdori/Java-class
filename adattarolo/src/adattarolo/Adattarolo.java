package adattarolo;

import java.util.LinkedList;
import java.util.Scanner;

public class Adattarolo {

    public static void main(String[] args) {
        
        Scanner billentyu = new Scanner (System.in);
        LinkedList<Integer> azon = new LinkedList<>();
        LinkedList<String> nevek = new LinkedList<>();
        LinkedList<Float> fizetesek = new LinkedList<>();
        System.out.println("Kérem az azonosítót: ");
        Integer az = billentyu.nextInt();
        while(az!=0){
            azon.add(az);
            System.out.println("Kérek egy nevet: ");
            String nev = billentyu.next();
            nevek.add(nev);
            System.out.println("Kérek egy fizetést ");
            Float fizetes = billentyu.nextFloat();
            fizetesek.add(fizetes);
            System.out.println("Kérem az azonosítót: ");
            az = billentyu.nextInt();
        }
        
        
        
    }
    
}
