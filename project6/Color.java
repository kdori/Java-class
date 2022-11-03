/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author kutas
 */
public enum Color {
    BLACK,
    WHITE,
    RED,
    GINGER,
    TRICOLOR,
    TABBY,
    GREY;
    
    static void printColors(){
        for(Color color : Color.values()){
            System.out.println(color);
        }
    }
}
