/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;

/**
 *
 * @author kutas
 */
public class DateOutOfBoundException extends Exception{

    public DateOutOfBoundException() {
    }

    public DateOutOfBoundException(String message) {
        super(message);
    }

    public DateOutOfBoundException(Throwable cause) {
        super(cause);
    }

    public DateOutOfBoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
    
}
