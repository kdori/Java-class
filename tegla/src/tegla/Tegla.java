package tegla;

import java.util.Scanner;

public class Tegla {

    public static void main(String[] args) {
        Teglak t = new Teglak();
        Scanner bill = new Scanner (System.in);
        System.out.println("Téglatest hosszúsága:");
        int a = bill.nextInt();
        System.out.println("Téglatest szélessége:");
        int b = bill.nextInt();
        System.out.println("Téglatest magassága:");
        int c = bill.nextInt();
        
        System.out.println("A test térfogata: " + teglat(a,b,c));
        System.out.println("A test felszíne: " + teglaf(a,b,c));
        System.out.println("A test térfogata: " + t.terf(a,b,c));
        System.out.println("A test felszíne: " + t.felsz(a,b,c));
        
    }
    private static int teglat(int a, int b, int c){
        return a*b*c;
    }
    private static int teglaf(int a, int b, int c){
        return 2*(a*b + a*c + b*c);
    }
    
}
class Teglak{
    public int terf(int a, int b, int c){
        return a*b*c;
    }
    public int felsz(int a, int b, int c){
        return 2*(a*b + a*c + b*c);
    }
}
