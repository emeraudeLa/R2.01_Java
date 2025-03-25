import java.util.HashMap; 

public class Etudiant {
    
    public int matricule;
    public String nom;
    public String prenom;
    HashMap<Cours, Integer> cours = new HashMap<Cours, Integer>();

    public static int numero=0;

    public Etudiant (String nom, String prenom){
        this.matricule=numero;
        numero++;
        this.nom=nom;
        this.prenom=prenom;
    }

    public int getMatricule() {
        return matricule;
    }

    public boolean equals(Etudiant etu){
        if((etu.getMatricule() == matricule)){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "Matricule = "+matricule+", nom = "+nom+", prenom = "+prenom;
    }

    public void addNote(Cours matiere, Integer note){
        cours.put(matiere, note);
    }

    public void setNote(Cours matiere, Integer note){
        Integer oldValue = cours.get(matiere);
        cours.replace(matiere, oldValue ,note);
    }

    public void supNote(Cours matiere){
        cours.remove(matiere);
    }

    public void afficheNotes (){
        for (Cours i : cours.keySet()) {
            System.out.println("Matiere: " + i + ", Note: " + cours.get(i));
        }
    }

    public int moyNotes (){
        int nb=0;
        int somme=0;
        for (Cours i : cours.keySet()) {
            somme=somme+cours.get(i);
            nb++;
        }
        return somme/nb;
    }

    public Integer getNote(Cours matiere){
        return cours.get(matiere);
    }

    public Integer maxNote (){
        int max=0;
        for (Cours i : cours.keySet()) {
            if(max<cours.get(i)){
                max=cours.get(i);
            }
        }
        return max;
    }

    public Integer minNote (){
        int min=100000;
        for (Cours i : cours.keySet()) {
            if(min>cours.get(i)){
                min=cours.get(i);
            }
        }
        return min;
    }

} 