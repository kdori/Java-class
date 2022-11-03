package service;

import java.util.List;
import model.Model;

public class serv {
    
    public boolean changeKedv(String beNev,Double kedv){
        
        try{
            
            Model m=new Model();
            Boolean find=Boolean.FALSE;
            for(Model mo: Model.liszt){
                
                if(mo.getNev().equals(beNev) && kedv<1){
                    
                    m=mo;
                    find=Boolean.TRUE;
                    break;
                    
                }
                
            }
            
            if(!find){
                
                return false;
                
            }
            m.setKedv(kedv);
            return true;
            
        }
        
        catch(Exception ex){
            
            System.out.println("Error"+ex);
            return false;
            
        }
        
    }
    
}
