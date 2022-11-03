/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.util.Scanner;

/**
 *
 * @author kutas
 */
public class Function {
    
    public static double[] quadraticFormulaReturn(){
        double a, b, c, root1, root2;
        double[] roots = new double[2];
        Scanner scn = new Scanner(System.in);
        System.out.println("Kérjük adja meg az a, b, és c értékét!");
        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();
        scn.close();
        roots[0] = (-b + Math.sqrt((b*b)-(4*a*c))) / 2*a;
        roots[1] = (-b - Math.sqrt((b*b)-(4*a*c))) / 2*a;
        System.out.println(roots[0]);
        System.out.println(roots[1]);
        return roots;
    }
    
    public static double[] quadraticFormulaReturn(double a, double b, double c){
        double[] roots = new double[2];
        roots[0] = (-b + Math.sqrt((b*b)-(4*a*c))) / 2*a;
        roots[1] = (-b - Math.sqrt((b*b)-(4*a*c))) / 2*a;
        System.out.println(roots[0]);
        System.out.println(roots[1]);
        return roots;
    }
    
    public static void quadraticFormulaVoid(){
        double a, b, c, root1, root2;
        double[] roots = new double[2];
        Scanner scn = new Scanner(System.in);
        System.out.println("Kérjük adja meg az a, b, és c értékét!");
        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();
        scn.close();
        roots[0] = (-b + Math.sqrt((b*b)-(4*a*c))) / 2*a;
        roots[1] = (-b - Math.sqrt((b*b)-(4*a*c))) / 2*a;
        System.out.println(roots[0]);
        System.out.println(roots[1]);
    }
    
    public static void quadraticFormulaVoid(double a,double b,double c){
        double[] roots = new double[2];
        roots[0] = (-b + Math.sqrt((b*b)-(4*a*c))) / 2*a;
        roots[1] = (-b - Math.sqrt((b*b)-(4*a*c))) / 2*a;
        System.out.println(roots[0]);
        System.out.println(roots[1]);
    }
    
    public static void printYourName(int n){
        if(n>0){
            System.out.print("Hello ");
            printYourName(n-1);
        }
    }
    
}
