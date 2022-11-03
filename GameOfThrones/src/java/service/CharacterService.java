package service;

import java.util.List;
import model.Character;

public class CharacterService {

public Boolean changeCharacterName(String newName, String oldName){
    try{
        Character c = new Character();
        Boolean find = Boolean.FALSE;
        for(Character ch : Character.characters){
            if(ch.getName().equals(oldName)){
                c = ch;
                find = Boolean.TRUE;
                break;
            }
        }
        if(!find){
            return false;
        }
        List<String> pAliases = c.getAliases(); 
        pAliases.add(oldName);
        c.setAliases(pAliases);
        c.setName(newName);
        return Boolean.TRUE;
    }
    catch(Exception ex){
        System.out.println("Error: " + ex.toString());
        return false;
    }
}
    
}
