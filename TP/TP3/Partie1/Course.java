import java.util.*;

public class Course{

    private int dotation;

    public Course (String  nom, String sexe, String race){
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