import java.util.*;
class Entreprises{
	private String nom;
    private Personne comptable;

	Entreprises(String nom, Personne comptable) {
		this.nom = nom;
		this.comptable = comptable;
	}
	
	public String toString() {
		return nom+" "+" "+comptable;
	}
	
	public void afficher() {
		System.out.println("Nom : "+nom);
		System.out.println("Comptable : "+comptable);
	}
	
}