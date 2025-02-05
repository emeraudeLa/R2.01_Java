// Compte

import java.util.*;
class Compte{

	protected String numero;
	protected Personne titulaire;
	protected double solde;

	Compte(String i, Personne ti){
		this.numero = i;
		this.titulaire = ti;
		this.solde = 0;
	}
	
	public String toString() {
		return "compte numéro : "+numero;
	}
	
    public void afficher(){
        System.out.println(toString()+"\nTitulaire :");
        titulaire.afficher();
        System.out.println("Solde :"+solde);
    }

    public void depotArgent(Scanner entree){
        double ligne;
        System.out.println("Depôt de combien :");
        ligne=entree.nextDouble();
        solde=solde+ligne;
    }

    public void retraitArgent(Scanner entree){
        double ligne;
        System.out.println("Retrait de combien :");
        ligne=entree.nextDouble();
        if(solde-ligne>=0){
            solde=solde-ligne;
        }
        else{
            System.out.println("Retrait imposible, montant a retirer supérieur au solde actuel");
        }
    }

    /*public static void main(String[] args){
        Scanner entree = new Scanner(System.in);//ouverture scanner

        Personne per = new Personne("REICHERT", "Jamal", "29200 BREST");
        Compte client = new Compte("SAG0U1N5",per);
        client.afficher();

        client.depotArgent(entree);
        client.afficher();

        client.retraitArgent(entree);
        client.afficher();

        entree.close();//ferme le scanner
    }*/
	
}
