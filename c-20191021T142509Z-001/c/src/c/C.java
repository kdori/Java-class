package c;
 
public class C {
    public static void main(String[] args) {
        Kutya k = new Kutya();
        k.setNev("Morzsi");
        //k.kor = 0;
        //k.him = true;
        
        Kutya u = new Kutya();
        u.setNev("Lujzi");
        //u.kor = 0;
        //u.him = false;
        
        System.out.println(k.getNev());
        System.out.println(u.getNev());
        System.out.println(u.getKor());
        System.out.println(u.isHim());
        
        System.out.println(k.getNev() + " " + k.getKor() + " éves");
        k.szulinap();
        System.out.println(k.getNev() + " " + k.getKor() + " éves");
        k.cheatKor(-4);
        System.out.println(k.getNev() + " " + k.getKor() + " éves");
        //k.him=false;
        k.ugat();
        u.ugat();
        
        Kutya t = new Kutya("Morgó",-5,true);
        System.out.println(t.getNev() + " " + t.getKor() + " éves");
        
       /* Kutya y = t.parosodik(u);
        System.out.println(y.getNev()+ " "+ y.getKor() + "éves. Neme: "+y.isHim());
        /*try{
            Kutya y = t.parosodik(u);
        System.out.println(y.getNev()+ " "+ y.getKor() + "éves. Neme: "+y.isHim());
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }*/
        if(t.isHim()!=u.isHim())
        {
            Kutya a = Kutya.parosodas(k,u);
        System.out.println(a.getNev()+ " "+ a.getKor() + "éves. Neme: "+a.isHim());
        }
        else System.out.println("Nem tudnak párosodni");
        
        csiga cs=new csiga();
        cs.eszik();
        cs.kor=3;//HF:protected 
    }
    
}
