import java.util.*;

public class Entraineur extends Personne{

    private String numLicence;

    public Entraineur (String  nom, String prenom, String adresse, String numLicence){
        super(nom,prenom,adresse);
        this.numLicence = numLicence;
    }

    public String getLicence (){return this.numLicence;}

    public String toString(){
        return super.toString()+", num licence :"+numLicence;
    }


}