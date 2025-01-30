public class Produit {
    private String reference;
    private int dateEntree;

    public static int nbJours=0;

    public Produit(String reference){
        nbJours=nbJours+1;
        this.dateEntree=nbJours;
        this.reference=reference;
    }

    public String toString(){
        return "("+reference+" | "+nbJours+")";
    }
}