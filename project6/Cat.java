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
public class Cat implements Mammal{
    private String breed;
    private String fur;
    private String name;

    @Override
    public void whatDoesItSay() {
         System.out.println("Meow.Meow.");
    }

    @Override
    public void eat(String food) {
        System.out.println("Cat is eating: " + food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String breed, String fur, String name) {
        this.breed = breed;
        this.fur = fur;
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }
    
    
}
