package practice2;

public class Practice2 {

    public static void main(String[] args) {
        
        int x = 7 + 4 + 5;
        System.out.println(x);
        
        int y= x - 22;
        System.out.println(y);
        
        int z = x * y * -1;
        System.out.println(z);
        
        String myText = "Text";
        System.out.println(myText + y);
        System.out.println(y + x + myText);
        
        int i = 100;
        System.out.println(++i);
        System.out.println(++i);
        
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);
        
        int j = i++ + ++i;
        System.out.println(j);
        
        j = ++i + i++;
        System.out.println(j);
        
        int k = j + 2;
        System.out.println(k);
        
        k += j;
        System.out.println(k);
        
        boolean b = x < 100;
        System.out.println(b);
        
        boolean c = j < 100;
        System.out.println(c);
        
        boolean d = b | c;
        System.out.println(d);
        
        boolean b2 = !(true && false && (!false || true) || (true && !false));
        System.out.println(b2);
        
        int e = 205;
        System.out.println(e < 100? "kis szám": "nagy szám");
        System.out.println(e % 2 == 0? "a(z)"+ e +" páros szám":"a(z)"+ e + " páratlan szám");
        
        if (b) {
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }
        
        // Challenge: 
        /*
        Döntsük el,hogy egy év szökőév-e?
        Döntsük el, hogy egy háromszögről, hogy megszerkeszthető-e?
        */
        //Challenge 01
        int year = 1900;
        if(year%4==0 && year%100!=0 || year%400==0)
            System.out.println("Ez az év szökőév.");
        else
            System.out.println("Ez az év nem szökőév.");
        //Challenge 02
        int elso_oldal = 5;
        int masodik_oldal = 6;
        int harmadik_oldal = 10;
        if ((elso_oldal + masodik_oldal >= harmadik_oldal) && (masodik_oldal + harmadik_oldal >= elso_oldal) && (elso_oldal + harmadik_oldal >= masodik_oldal))
            System.out.println("A háromszög megszerkeszthető!");
        else
            System.out.println("A háromszög nem szerkeszthető meg!");
        
        
        
        
    }
    
}
