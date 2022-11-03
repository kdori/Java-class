package egy.ketto;

import java.io.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class EgyKetto {

    public static void main(String[] args) throws IOException
    {
        out.print("Kérek egy karaktert: ");
        char karakter = (char) in.read();
        
        switch (karakter){
            case '0':out.println("nulla"); break;
            case '1':out.println("egy"); break;
            case '2':out.println("kettő"); break;
            case '3':out.println("három"); break;
            case '4':out.println("négy"); break;
            case '5':out.println("öt"); break;
            case '6':out.println("hat"); break;
            case '7':out.println("hét"); break;
            case '8':out.println("nyolc"); break;
            case '9':out.println("kilenc"); break;
            default: out.println("nem szám"); break;
        }
        
    }
    
}
