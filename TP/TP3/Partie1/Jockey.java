import java.util.*;

public class Jockey extends Personne{

    private int salaire;
    private int poids;

    public Jockey (String  nom, String prenom, String adresse, int salaire, int poids){
        super(nom,prenom,adresse);
        this.salaire = salaire;
        this.poids = poids;
    }

    public int getSalaire (){return this.salaire;}
    public int getpoids (){return this.poids;}

    public String toString(){
        return super.toString()+", salaire :"+salaire+", poids :"+poids;
    }


}