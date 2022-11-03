package c;
public class csiga extends Allat{
    private Integer sebesseg;
    private Boolean meztelen;
    
    public csiga(){
        this.nev = "Új Csiga";
        this.kor = 0;
        this.sebesseg = 1;
        this.meztelen = true;
    }
    
    public csiga(String nev,Integer kor, Integer sebesseg, Boolean meztelenE ){
        this.nev = nev;
        this.kor = kor;
        this.sebesseg = sebesseg;
        this.meztelen = meztelenE;
    }

    public Integer getSebesseg() {
        return this.sebesseg;
    }

    public Boolean isMeztelen() {
        return this.meztelen;
    }
    
    public void setSebesseg(String jel){
    if(jel.equals("<"))
        this.sebesseg++;
    if(jel.equals(">"))
        this.sebesseg--;
    }
    
    public void meztelenLesz(){
        if(!this.meztelen){
            this.meztelen = true;
        }
    }
    
    public void hazatSzerez(){
        if(this.meztelen){
            this.meztelen = false;
        }
    }
    
    public static csiga parosodás(csiga egyik,csiga masik){
        csiga u = new csiga();
        u.setNev(egyik.nev);
        u.meztelen=masik.meztelen;
        return u;
    }
    
    @Override
    public void eszik(){
        System.out.println("Zzz-zzz");
    }

   
    
    
    
}
