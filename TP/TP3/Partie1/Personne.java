import java.util.*;

public class Personne {
    protected String nom;
    protected String prenom;
    protected String adresse;

    public Personne (String  nom, String prenom, String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public String getNom (){return this.nom;}
    public String getPrenom (){return this.prenom;}
    public String getAdresse (){return this.adresse;}

    public String toString(){
        return "nom = "+nom+",prenom = "+prenom+", adresse = "+adresse;
    }


}