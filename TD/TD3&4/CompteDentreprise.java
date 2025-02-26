import java.util.*;
class CompteDentreprise extends Compte{

    private Entreprises proprio;

    public CompteDentreprise(String i, Personne ti, Entreprises proprio){
        super(i, ti);
        this.proprio=proprio;
	}

    public String toString(){
        return super.toString()+" "+" "+proprio+" "+solde;
    }
    
    public void afficher(){
        super.afficher();
    }

    public void mettreSoldeAzero(){
        solde=0;
    }

}