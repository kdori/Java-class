package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    
public static List<Model> liszt = new ArrayList<Model>();
    
private String nev;
private Integer atlar;
private Double kedv;
private Double aktar;

public Model(){
    
    liszt.clear();
    liszt.add(new Model("kukoricaliszt",280,1.0,0.0));
    liszt.add(new Model("rizsliszt",450,1.0,0.0));
    liszt.add(new Model("mandulaliszt",5600,1.0,0.0));
}
   
public Model(String nev, Integer atlar, Double kedv, Double aktar){
    
    this.nev=nev;
    this.atlar=atlar;
    this.kedv=kedv;
    this.aktar=aktar;
    
}

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getAtlar() {
        return atlar;
    }

    public void setAtlar(Integer atlar) {
        this.atlar = atlar;
    }

    public Double getKedv() {
        return kedv;
    }

    public void setKedv(Double kedv) {
        this.kedv = kedv;
    }

    public Double getAktar() {
        return aktar;
    }

    public void setAktar(Double aktar) {
        this.aktar = atlar*(1-kedv);
    }



}
