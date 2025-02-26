import java.util.*;
class Banque{
	private String nom;
    private ArrayList<Compte> tableCompte = new ArrayList<Compte>(30);

	Banque(String nom, Personne comptable) {
		this.nom = nom;
		tableCompte = new ArrayList<>(30);
    }
	
	
	public void ajoutCompte(Compte compt){
        tableCompte.add(compt);
	}
	
    public void afficher (){
        for (int i=0;i<tableCompte.size();i++){
            tableCompte.get(i).afficher();
        }
    }
}