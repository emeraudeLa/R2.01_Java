import java.util.*;

public class ChevalDeCourse extends Cheval{

    private int montantGain;
    private Jockey jockey;

    public ChevalDeCourse (String  nom, String sexe, String race, int montantGain){
        super(nom,sexe,race);
        this.montantGain = montantGain;
        this.jockey = new Jockey(" "," "," ",0,0);
    }

    public void affiche (){
        super.toString();
    }

    public void attribueJockey(Jockey j){
        this.jockey=j;
    }


}