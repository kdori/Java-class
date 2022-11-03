package project3;

public class Project3 {

    public static void main(String[] args) {
        int day = 5;
        switch(day){
            case 1: 
                System.out.println("Hetfő"); 
                break;
            case 2:
                System.out.println("Kedd"); 
                break;
            case 3: 
                System.out.println("Szerda");
                break;
            case 4: 
                System.out.println("Csütörtök");
                break;
            case 5: 
                System.out.println("Péntek");
                break;
            case 6: 
                System.out.println("Szombat");
                break;
            case 7: 
                System.out.println("Vasárnap");
                break;
            default: 
                System.out.println("Egy hét hét napos!");             
        }
        
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hétköznap");
                break;
            case 6:
            case 7:
                System.out.println("Hétvége");
                break;
            default: 
                System.out.println("Ismeretlen nap");
        }
        
        int nap = 4;
        String nameOfDay = switch(nap){
            
            case 1 -> "Hétfő";
            case 2 -> "Kedd";
            case 3 -> "Szerda";
            case 4 -> "Csütörtök";
            case 5 -> "Péntek";
            case 6 -> "Szombat";
            case 7 -> "Vasárnap";
            default -> "Ismeretlen nap";    
            // több változó 'yield'
        };
        
        System.out.println(nameOfDay);
        
        String opcio = "tea";
        switch(opcio){
            case "tanulás":
                    System.out.println("Nincs kedvem hozzá.");
                    break;
            case "Netflix":
                System.out.println("Ez már sokkal jobb ötlet.");
                break;
            case "programozás":
                System.out.println("Elég volt mára.");
                break;
            case "tea":
                System.out.println("Bármikor.");
                break;
            default:
                System.out.println("Ilyen opció nincs."); 
        }
        
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+". Hello World!");
        }
        
        //cimkézetlen break
        
        int[] tomb = {22,34,56,1,0,5,9,8,56};
        
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i]==56){
                System.out.println("Van 56 a számok között!");
                break;
            }
                
        }
        
        //for-each ...csak olvasásra
        
        String[] gyumi ={"alma","körte","barack","málna", "eper"};
        for (String gyumolcs: gyumi) {
            System.out.print(gyumolcs+" ");
        }
        
        //cimkézett break
        String[] napok = {"Hétfő","Kedd","Szerda","Csütörtök","Péntek","Szombat","Vasárnap"};
        String[] etkezesek ={"reggeli","tízórai","ebéd","uzsonna","vacsora"};      
        
        outer: for(String Nap:napok){
            System.out.println("\n"+Nap);
            inner: for(String Kaja:etkezesek){
                if(Nap.equals("Csütörtök")){
                    break inner;
                }
                System.out.print(" "+Kaja+" ");
            }
            
        // while
        int i = 0;
        while(!gyumi[i].equals("málna")){
            
            System.out.println(gyumi[i]+" ");
            i++;
        }
        
        //do-while -hátul tesztelős
        int j=5000;
        do{
            System.out.println(j);
            j/=10;
        }while(j >  0);
        } 
        
        double hatvany = Math.pow(3, 6);
        System.out.println(hatvany);
        //double hatv=1;
        
        //System.out.println(hatv);
        //System.out.println(Math.pow(alap, kitevo));
        int alap = 3;
        int kitevo = -3;
        double hatv = 1;
        boolean negative = false;
        if (kitevo<0) {
            kitevo *=-1;
            negative = true;
        }
        for (int i = 1; i <= kitevo; i++) {
            hatv*=alap;
        }
        if (negative) {
            hatv= 1 / hatv; 
        }
        System.out.println(hatv);
    }
}
