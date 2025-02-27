import java.util.*;

public class Sport {
    protected String code;
    protected String libelle;

    public Sport (String code, String libelle){
        this.code = code;
        this.libelle = libelle;
    }

    public String toString(){
        return "code="+code+", libelle="+libelle;
    }

    public void afficher(){
        System.out.println(toString());
    }
}