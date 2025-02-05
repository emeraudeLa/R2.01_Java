// CompteRemunere

import java.util.*;
class CompteRemunere extends Compte{
    private static final double tauxRemuneration = 1.05;

    public CompteRemunere(String i, Personne ti){
        super(i, ti);
	}

    public String toString(){
        return super.toString()+" "+" "+titulaire+" "+solde;
    }
    
    public void afficher(){
        super.afficher();
    }

    public void versementInt(){
        solde=solde+(solde*tauxRemuneration);
    }
}