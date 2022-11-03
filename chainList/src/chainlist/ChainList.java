package chainlist;

import java.util.LinkedList;
import java.util.Scanner;

public class ChainList {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        LinkedList<String> nevek = new LinkedList<>();
        
        System.out.println("Kérek egy nevet: ");
        String nev = scn.nextLine();
        while(nev.length() != 0){
            nevek.add(nev);
            System.out.println("Kérek egy nevet: ");
            nev = scn.nextLine();
        }
        System.out.println(nevek);
        
        System.out.println("Kérek egy nevet a lista elejére: ");
        nev = scn.nextLine();
        nevek.addFirst(nev);
        
        System.out.println("Kérek egy nevet a lista végére: ");
        nev = scn.nextLine();
        nevek.addLast(nev);
        
        System.out.println(nevek);
        
        System.out.println("Kérem a beszurandó név indexét: ");
        int szam = scn.nextInt();
        System.out.println("Kérem a beszurandó nevet: ");
        nev = scn.next();
        nevek.add(szam,nev);
        System.out.println(nevek);
        
        System.out.println("Kérem a törlendő elem indexét: ");
        szam = scn.nextInt();
        System.out.println("A törlendő név" + nevek.get(szam));
        nevek.remove(szam);
        
        System.out.println("Kérem a törlendő elemet: ");
        nev = scn.next();
        nevek.remove(szam);
        
        System.out.println(nevek);
    }
    
}
