package pkg3szog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       boolean valasz = szerk();
        if (valasz) {
            System.out.println("Szerkeszthető");
        }
    }
    
    public static boolean szerk(){
    boolean s;
    Scanner sc = new Scanner (System.in);
        System.out.println("A oldal ");
        int a = sc.nextInt();
        System.out.println("B oldal ");
        int b = sc.nextInt();
        System.out.println("C oldal ");
        int c = sc.nextInt();
        if (a + b < c && a + c < b && b + c < a) {
            s = true;
        }
        else s = false;
    return s;

}
    
}

