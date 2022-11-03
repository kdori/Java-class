package c;

import java.util.Random;

public class Kutya extends Allat{
    private Boolean him;

    
    public Kutya(){
        Random rnd = new Random(); 
        this.him = rnd.nextBoolean();
        this.kor = 0;
        this.nev="Új kutya";
    }
    
    public Kutya(String nev, Integer kor, Boolean him){
        this.nev = nev;
        if(kor >=0){this.kor = kor;}
        else {this.kor=0;}
        this.him = him;
    }
    
    public void cheatKor(Integer ev){
        if(this.kor<ev)
           this.kor=ev;
    }
    
    public Boolean isHim(){
        return this.him;
    }
    
    public void ugat(){
        System.out.println(this.nev+" mondja: Vau-vau");
    }
    
    public Kutya parosodik(Kutya tars){
        Kutya utod = null;
        if(this.him!=tars.him){
          utod = new Kutya();
          utod.nev=this.nev + " " + tars.nev;
        }
        return utod;
    }
    
    public static Kutya parosodas(Kutya egyik,Kutya masik){
        Kutya utod = null;
        if(egyik.him!=masik.him){
          utod = new Kutya();
          utod.nev=egyik.nev + " " + masik.nev;
        }
        return utod;
    }
}

