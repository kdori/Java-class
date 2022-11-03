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
public class Dog extends Animal implements Mammal{
    
    private String breed;
    private String size;
    private String fur;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public Dog(String breed, String size, String fur, int legs, String integument, String type, String name) {
        super(legs, integument, type, name);
        this.breed = breed;
        this.size = size;
        this.fur = fur;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void whatDoesItSay() {
        System.out.println("Vaú");
    }

    @Override
    public void eat(String food) {
         System.out.println("Dog is eating: " + food);
    }
    
    
    
}
