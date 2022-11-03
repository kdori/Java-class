package dinamikus.tomb;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class DinamikusTomb {

    public static void main(String[] args) {
        Scanner bil = new Scanner (System.in);
        ArrayList<String> nevek = new ArrayList<>();
        out.print("Kérek egy nevet: ");
        String nev = bil.nextLine();
        while(nev.length()!=0){
            nevek.add(nev);
            out.print("Kérek egy nevet: ");
            nev = bil.nextLine();
        }
        out.println(nevek);
        
        //elemszám
        
        out.println("Az elemek száma - " + nevek.size());
        
        //tetszőleges elem kiírása
        
        out.println("Keresendő elem indexe: ");
        int szam = bil.nextInt();
        out.println("keresett név" + nevek.get(szam));
        
        //elem módosítása set függvény
        
        out.println("Keresendő elem indexe: ");
        szam = bil.nextInt();
        out.println("keresett név" + nevek.get(szam));
        
        //törlés remove-al
    }
    
}
