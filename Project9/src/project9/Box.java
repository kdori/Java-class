/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project9;

/**
 *
 * @author kutas
 */
public class Box<T> {
    
    private T object;
    private String name;
    
    public boolean isEmpty(){
        return object == null;
    }
    
    public void put(T o){
        if(isEmpty()){
            this.object =
        }
    }
    
    public T get(){
        if(isEmpty()){
            System.out.println("A doboz üres, nem lehet semmit belőle kivenni.");
            return null;
        }
    }
    
    
    
}
