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
        System.out.println("Jour :");
        jour=entree.nextInt();
        System.out.println("Mois :");
        mois=entree.nextInt();
        System.out.println("Annee :");
        annee=entree.nextInt();

    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
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

    public boolean equals(Date d){
        if((d.getJour() == jour) && (d.getMois() == mois) && (d.getAnnee() == annee)){
            return true;
        }
        else{
            return false;
        }
    }

}
