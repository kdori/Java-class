/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

import static project6.Color.printColors;

/**
 *
 * @author kutas
 */
public class Practice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal animal = new Animal();
        Dog dog = new Dog("Fifike");
        dog.setBreed("kuvasz");
        System.out.println(dog.getBreed());
        
        Cat cat = new Cat("Ceci");
        cat.whatDoesItSay();
        dog.whatDoesItSay();
        
        printColors();
    }
    
}
