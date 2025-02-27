import java.util.*;

public class SportCo extends Sport {
    private int nbJoueurs;

    public SportCo (String code, String libelle, int nbJoueurs){
        super(code,libelle) ;
        this.nbJoueurs = nbJoueurs;
    }

    public void afficher(){
        System.out.println(toString());
    }

    public String toString(){
        return super.toString()+", nb Joueurs :"+nbJoueurs;
    }
    
    public void affiche(){
        super.afficher();
    }
}