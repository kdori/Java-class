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
public abstract class Animal {
    private int legs;
    private String integument;
    private String type;
    private String name;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getIntegument() {
        return integument;
    }

    public void setIntegument(String integument) {
        this.integument = integument;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int legs, String integument, String type, String name) {
        this.legs = legs;
        this.integument = integument;
        this.type = type;
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
    
    
    
}
