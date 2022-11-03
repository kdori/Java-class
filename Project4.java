/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author kutas
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] szamok = {4, 5, 6, 7, 8};
        int[] numbers = new int[10];
        // lehet több sorban is deklarálni
        System.out.println(numbers[5]);
        for (int num:numbers) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(numbers));
        
        int[] lottoSzamok = new int[90];
        for (int i = 0; i < lottoSzamok.length; i++) {
            lottoSzamok[i]=i+1;
        }
        System.out.println(Arrays.toString(lottoSzamok));
        
        String[] fruits = new String[5];
        fruits[0]="alma";
        fruits[2]= "barack";
        fruits[4]= "szőlő";
        System.out.println(Arrays.toString(fruits));
        System.out.println(fruits[0].length());
        int[][] dimenzio = new int[2][];
        
        
        
        String[][] names = {{"Laci", "Tomi", "Elek"},{"Éva", "Rita"}};
        
        int[][] a = {
            {1, 2, 3},
            {4, 5},
            {6}
        };
        
        System.out.println("Sorok hossza: ");
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        
        List<Integer> szamok4 = new ArrayList<>();
        
        szamok4.add(23);
        szamok4.add(245);
        System.out.println(szamok4.get(1));
        System.out.println(szamok4.size());
        szamok4.add(szamok4.size());
        System.out.println(szamok4.get(2));
        System.out.println(szamok4.size());
        
        List<Integer> hatvanyok = new ArrayList<>();
        int hatvany;
        for (int i = 0; i <= 20; i++) {
            hatvany = (int)Math.pow(2, i);
            hatvanyok.add(hatvany);
            
        }
        
        //palindrom 
        String text = "ablakzsiráf";
        text = text.toLowerCase();
        text = text.replace(" ", "");
        text = text.replace(".", "");
        boolean palindrom = false;
        System.out.println(text.charAt(0));
        for (int i = 0; i < text.length(); i++){ 
            
            if (text.charAt(i) == text.charAt(text.length()-1-i)) {
                palindrom = true;
            }
            else
                break;
        }
        System.out.println(palindrom ? "Ez egy palindrom." : "Ez nem egy palindrom.");
        //Level expert: naptár.
        
    }
    
}
