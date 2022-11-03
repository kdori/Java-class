package c;
public abstract class Allat {
    
    public String nev;
    public Integer kor;

    public Allat() {
    }

    public Allat(String nev, Integer kor) {
        this.nev = nev;
        this.kor = kor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getKor() {
        return kor;
    }

    public void szulinap() {
        this.kor++;
    }
    
    public void eszik(){
        System.out.println("Ham-ham");
    }
    
    
    
}
