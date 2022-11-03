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
public class InvalidDayException extends Exception{

    public InvalidDayException() {
    }

    public InvalidDayException(String message) {
        super(message);
    }

    public InvalidDayException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDayException(Throwable cause) {
        super(cause);
    }
    
}
