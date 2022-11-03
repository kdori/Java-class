package ketto;

import static java.lang.System.out;
import java.util.Scanner;

public class Ketto {

    public static void main(String[] args) {
        final int MAX = 5; //konstans, állandó, nem változik az értéke
        Scanner bil = new Scanner (System.in);
        int[] tomb = new int[MAX];
        //feltöltés
        for (int i = 0; i < MAX; i++) {
            out.printf("Kérem a(z) %d. számot: ",i+1);
            tomb[i] = bil.nextInt();
        }
        //min-max
        /*int legk=tomb[0],legn=tomb[0];
        for (int i = 1; i < MAX; i++) {
            if(legk>tomb[i]){
                legk=tomb[i];
            }
            if(legn<tomb[i]){
                legn=tomb[i];
            }
            
        }*/
        Minmax m = new Minmax();
        int legk = m.min(tomb);
        int legn = m.max(tomb);
        out.println("Minimum "+legk);
        out.println("Maximum "+legn);
        
        //rendezés
        
        /*int csere;
        for (int i = 0; i < MAX-1; i++)
            for (int j = 0; j < MAX-j-1; j++) 
                if (tomb[j]>tomb[j+1]) {
                    csere=tomb[j];
                    tomb[j]=tomb[j+1];
                    tomb[j+1]=csere;
                }*/
        Rendezes r = new Rendezes();
        r.rendez(tomb);
        for(int i : tomb)
            out.println(i);
    }
    static class Minmax{
        final int MAX = 5;
    
        int min(int[] t){
            int legk = t[0];
            for (int i = 1; i < 5; i++) {
            if(legk>t[i])legk=t[i];
            
        }
            return legk;
        }
        
        int max(int[] t){
            int legn = t[0];
            for (int i = 1; i < 5; i++) {
            if(legn<t[i]){
                legn=t[i];
            }
            }
            return legn;    
        }
    
    }
    static class Rendezes{
        final static int MAX = 5;
        void rendez(int[] t){
            int cs = 0;
            for (int i = 0; i < MAX-1; i++)
            for (int j = 0; j < MAX-j-1; j++) 
                if (t[i]>t[j+1]) {
                    cs=t[i];
                    t[i]=t[j+1];
                    t[j+1]=cs;
                }
        
        }
    }
    
}
