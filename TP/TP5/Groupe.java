import java.util.HashSet; 

public class Groupe {

    public String nom;
    HashSet<Etudiant> etudiants = new HashSet<Etudiant>();

    public Groupe (String nom){
        this.nom=nom;
    }

    public void addEtudiant(Etudiant eleve){
        etudiants.add(eleve);
    }

} 