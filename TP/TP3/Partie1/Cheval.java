import java.util.*;

public class Cheval{

    protected int numInscription;
    protected String nom;
    protected String sexe;
    protected String race;

    public static int count =0;

    public Cheval (String  nom, String sexe, String race){
        this.nom = nom;
        this.sexe = sexe;
        this.race = race;
        this.numInscription=count;
        count++;
    }

    public String getNom (){return this.nom;}
    public String getSexe (){return this.sexe;}
    public String getRace (){return this.race;}
    public int getNumIncrip (){return this.numInscription;}

    public String toString(){
        return "num incription = "+numInscription+", nom = "+nom+",sexe = "+sexe+", race = "+race;
    }


}