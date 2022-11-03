package osztaly;

import java.util.Scanner;

public class Osztaly {

    public static void main(String[] args) {
       beolvas ob = new beolvas();
       szamol (ob);
    }
    
    private static void szamol(beolvas o){
        System.out.println("A téglatest felszíne " + (2*(o.a*o.b + o.a*o.c + o.b*o.c)));
        System.out.println("A téglatest térfogata " + (o.a*o.b*o.c));
    }
    
}
class beolvas{
    public int a,b,c;
    public beolvas() {
    Scanner bill = new Scanner (System.in);
    System.out.println("Téglatest hosszúsága:");
    a = bill.nextInt();
    System.out.println("Téglatest szélessége:");
    b = bill.nextInt();
    System.out.println("Téglatest magassága:");
    c = bill.nextInt();
    }
    