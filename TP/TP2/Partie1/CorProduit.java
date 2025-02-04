import java.util.Scanner;

public class CorProduit{
    private String reference;
    private int dateEntree;
    public Produit(int dateEntree, Sacnner scan){
        System.out.println("Veuillez entrer la référence du produit : ");
        this.reference = Saisir.chaine(scan);
        this.dateEntree= dateEntree;
    }
    public void afficherProduit(){
        System.out.println("Produit [reference="+reference+", dateEtree="+dateEntree+"]");
    }
    public String getReference (){return reference;}
    public void setReference(String reference){this.reference=reference;}
    public int getInstance(){return dateEntree;}
    public void setDateEntree(int dateEntree){this.dateEntree=dateEntree;}
}