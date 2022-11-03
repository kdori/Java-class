package repulnyil;

import java.util.ArrayList;
import java.util.List;

public class Orszag {
    
    private String nev;
    private String fovaros;
    private List<String> celorszagNevek;
    
    public Orszag(){}
    
    public Orszag(String nev, String fovaros){
        
        this.nev = nev;
        this.fovaros = fovaros;
        this.celorszagNevek = new ArrayList();
        
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getFovaros() {
        return fovaros;
    }

    public void setFovaros(String fovaros) {
        this.fovaros = fovaros;
    }

    public List<String> getCelorszagNevek() {
        return celorszagNevek;
    }

    public Boolean addCelorszagNevek(String celorszagNev) { 
        Boolean talalt = false;
        for (String nev : this.celorszagNevek) {
            if (nev.equals(celorszagNev)) {
                return false;
            } 
        }
        this.celorszagNevek.add(celorszagNev);
        return true;
    }
    
    public void removeCelorszagNevek(String torlendoNev) {
        this.celorszagNevek.remove(torlendoNev);
    }
    
    
}
