package teglak;

import java.util.Scanner;

public class Teglak {

    public static void main(String[] args) {
        Tegla t=new Tegla();
    }
}
class Tegla{
    public int a,b,c;
    public Tegla() {
        Scanner bill = new Scanner (System.in);
        System.out.println("Téglatest hosszúsága:");
        a = bill.nextInt();
        System.out.println("Téglatest szélessége:");
        b = bill.nextInt();
        System.out.println("Téglatest magassága:");
        c = bill.nextInt();
        System.out.println("Térfogat " + (a*b*c));
        System.out.println("Felszín " + (2*(a*b + a*c + b*c)));
    }
}
