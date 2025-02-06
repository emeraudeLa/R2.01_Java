import java.util.*;

public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date (int jour,int mois,int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void entreeDate(Scanner entree){
        String d;
        String j;
        String a;
        System.out.println("Jour :");
        d=entree.next();
        jour=Integer.parseInt(d);
        System.out.println("Mois :");
        j=entree.next();
        mois=Integer.parseInt(j);
        System.out.println("Annee :");
        a=entree.next();
        annee=Integer.parseInt(a);
    }

    public void afficher(){
        System.out.println(jour+"/"+mois+"/"+annee);
    }

    public static void main(String[] args){
        Scanner entree = new Scanner(System.in);//ouverture scanner
        Date today = new Date(7,8,2006);
        today.afficher();
        today.entreeDate(entree);
        today.afficher();
        entree.close();//ferme le scanner
    }

}
