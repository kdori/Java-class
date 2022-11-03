package skala;

enum HomersekletSkala { CELSIUS, FAHRENHEIT, KELVIN, RANKINE, NEWTON, DELISLE, RÉAUMUR, RÖMER, LEIDEN };

public class Skala {

    public static void main(String[] args) {
        final String Formatum = "%5.2f° %s-fok\n";
        Homer hom = new Homer();
        System.out.printf(Formatum, hom.getSzam(), hom.getSkala());
        
        hom = new Homer(25.6);
        System.out.printf(Formatum, hom.getSzam(), hom.getSkala());
        
        hom = new Homer(HomersekletSkala.FAHRENHEIT);
        System.out.printf(Formatum, hom.getSzam(), hom.getSkala());
        
        hom = new Homer(2.73, HomersekletSkala.KELVIN);
        System.out.printf(Formatum, hom.getSzam(), hom.getSkala());
        
        ujHomer ujhom = new ujHomer();
        ujhom.kiir();
        
        ujhom = new ujHomer(25.6);
        ujhom.kiir();
        
        ujhom = new ujHomer(HomersekletSkala.FAHRENHEIT);
        ujhom.kiir();
        
        ujhom = new ujHomer(2.73, HomersekletSkala.KELVIN);
        ujhom.kiir();
    }
}
class Homer {
    protected double szam;
    protected HomersekletSkala skala;
    
    public Homer() {
        szam = 12.0;
        skala = HomersekletSkala.CELSIUS;
    }
    
    public Homer(double szam){
        this.szam = szam;
        skala = HomersekletSkala.RÉAUMUR;
    }
    
    public Homer(HomersekletSkala skala){
        szam = 9.8;
        this.skala = skala;
    }
    
    public Homer(double szam, HomersekletSkala skala){
        this.szam = szam;
        this.skala = skala;
    }
    
    public double getSzam() {
        return szam;
    }
    
    public HomersekletSkala getSkala() {
        return skala;
    }
}

class ujHomer extends Homer{
    
    public ujHomer(){
        szam = 120.0;
        skala = HomersekletSkala.CELSIUS;
    }
    
    public ujHomer(double szam){
        super(szam);
    }
    
    public ujHomer(HomersekletSkala skala){
        super(skala);
    }
    
    public ujHomer(double szam, HomersekletSkala skala){
        super(szam,skala);
    }
    
    public void kiir(){
        System.out.printf("%5.2f° %s-fok\n", getSzam(), getSkala());
    }
}
