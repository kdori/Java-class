/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;

/**
 *
 * @author kutas
 */
public class Project8 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws practice8.InvalidEmailFormtException
     */
    public static void main(String[] args) throws IOException, InvalidEmailFormtException{
        // TODO code application logic here
        File file = new File("data.txt");
        
        PrintWriter pw = new PrintWriter(file);
        pw.print("A kurzus létszáma: ");
        pw.println(10);
        pw.print("Ez a ");
        pw.print(8);
        pw.print(". gyakorlat");
        pw.close();
        
        Scanner scn = new Scanner(file);
        String firstRow = scn.nextLine();
        String secondRow = scn.nextLine();
        scn.close();
        System.out.println(firstRow + "\n" + secondRow);
        
        RandomAccessFile raf = new RandomAccessFile("data.txt","rw");
        String row1 = null, row2 = null;
        
        /*try {
            row1 = raf.readLine();
            row2 = raf.readLine();
        } catch (IOException ex) {
            System.out.println("Hiba a fájl írása/olvasása közben");
        }
        System.out.println(row1 + "\n" + row2);*/
        
        /*List<String> rows = new ArrayList<>();
        for(String row = raf.readLine(); row != null; row = raf.readLine()){
            rows.add(row);
        }
        
        for(String r : rows){
            System.out.println(r);
        }*/
        
        RandomAccessFile raf2 = new RandomAccessFile("names.txt","rw");
        /*String[] names = {"Tom","Peter","Ann","Jennifer","Lewis","William"};
        for(String n : names){
            raf2.writeBytes(n + "\n");
        }*/
        
        String[] names2 = {"Eve","Adam","Petra","Carl"};
        //raf2.seek(raf2.length());
        raf.seek(4);
        for(String n : names2){
            raf2.writeBytes(n + "\n");
        }
        
        //Reguláris kifejezések - leíró nyelv
        
        String input = "hellohello";
        
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());
        
        String regex = "hello";
        
        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(input);
        int count = 0;
        while(mt.find()){
            count++;
        }
        System.out.println(count);
        //van benne @, utána pont, végén legalább két kisbetű
        String mail = "cirkuszzebra@citromail.hu"; 
        String neptun = "xyz@gamma.ttk.pte.hu";
        String szamos = "_me.1234@zebra.com";
        String rossz = ".@.";
        Pattern hf = Pattern.compile("[0-9a-zA-Z][0-9a-zA-Z]+@[a-zA-Z]*[mail]*\\.[a-z][a-z]+");
        Matcher mhf;
       
        try(mhf = hf.matcher(szamos)){
             System.out.println(mhf.find());
        }catch{InvalidEmailFormtException ex){
            System.out.println("Hibás email cím");
        }
        
    }
    
}
