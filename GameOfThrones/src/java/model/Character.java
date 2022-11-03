package model;

import java.util.ArrayList;
import java.util.List;

public class Character {

//Ezt nem kell érteni:
public static List<Character> characters = new ArrayList<Character>();
    
private String name;
private String family;
private Integer point;
private List<String> aliases = new ArrayList<String>();

//Ezt sem kell érteni:
public Character(){
characters.clear();
characters.add(new Character("Jon Snow", "Stark", 0, new ArrayList()));
characters.add(new Character("Hot Pie", "", 0, new ArrayList()));
characters.add(new Character("Podrick", "", 1, new ArrayList()));
}

    public Character(String name, String family, Integer point, List<String> aliases) {
        this.name = name;
        this.family = family;
        this.point = point;
        this.aliases = aliases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getPoint() {
        return point;
    }

    /*public void setPoint(Integer point) {
        this.point = point;
    }*/
    
    public void pointPlus() {
        this.point++;
    }
    
    public void pointMinus() {
        this.point--;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }




}
