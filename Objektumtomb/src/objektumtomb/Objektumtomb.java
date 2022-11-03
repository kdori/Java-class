//Ékezetes betűk előállítása, ha nem az előre beállítottat szeretnénk
package objektumtomb;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;

public class Objektumtomb {

    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        
        Szoba_OB szoba[] = new Szoba_OB[5];
        Scanner bill = new Scanner(System.in, "ISO8859_2");
        
//Tömb feltöltése
        for(int szobaszam = 0; szobaszam < 5; szobaszam++){
            szoba[szobaszam] = new Szoba_OB();
            szoba[szobaszam].Be(bill);
        }
        
//Tömb kiírása
        out.println("Szobaszám Vendég neve Társak száma\tÁr");
        for(int i = 0; i < 5; i++){
            out.printf("\t%d\t", i+1);
            szoba[i].Ki();
        }        
    }    
}

class Szoba_OB{
    private String vendeg;
    private int tars;
    private double ar;
    final NumberFormat penznem = NumberFormat.getCurrencyInstance();
    
    public void Be(Scanner bill){
        out.print("Kérem a vendég nevét: ");
        vendeg = bill.next();
        out.print("Kérem a társak számát: ");
        tars = bill.nextInt();
        out.print("Kérem a szoba árát: ");
        ar = bill.nextDouble();
    }
    
    public void Ki(){
        out.print(vendeg);
        out.print("\t\t");
        out.print(tars);
        out.print("\t");
        out.println(penznem.format(ar));
    }
}