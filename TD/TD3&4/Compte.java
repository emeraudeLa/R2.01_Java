// Compte

import java.util.*;
class Compte{

	private String numero;
	private Personne titulaire;
	private double solde;

	Compte(String i, Personne ti){
		this.numero = i;
		this.titulaire = ti;
		this.solde = 0;
	}
	
	public String toString() {
		return "compte num�ro : "+numero;
	}
	
	
}
