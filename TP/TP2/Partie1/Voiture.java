public class Voiture {
    private int identifiant;
    private String marque;
    private float vitesse;
    private float kilometre;

    public static int nbVoitures=0;

    //Builder
    public Voiture(String marque, float vitesse, float kilometre){
        nbVoitures=nbVoitures+1;
        this.identifiant=nbVoitures;
        /*
        this.setMarque(marque);
        this.setVitesse(vitesse);
        this.setKilometre(kilometre);
        */
        this.marque=marque;
        this.vitesse=vitesse;
        this.kilometre=kilometre;
    }

    //Setters
    public void setMarque(String marque){
        this.marque=marque;
    }
    public void setVitesse(float vitesse){
        this.vitesse=vitesse;
    }
    public void setKilometre(float kilometre){
        this.kilometre=kilometre;
    }

    //Getters
    public int getId(){return identifiant;}
    public String getMarque(){return marque;}
    public float getVitesse(){return vitesse;}
    public float getKilometre(){return kilometre;}

    public String toString(){
        return "("+identifiant+" | "+marque+" | "+vitesse+" | "+kilometre+")";
    }

    public void afficher(){
        System.out.println(toString());
    }
    
    public static void main(String[] args){
        Voiture v1 = new Voiture("citroen",150.7f,546.8f);
        v1.afficher();
        Voiture v2 = new Voiture("peugeot",1000.7f,754.8f);
        
        v2.afficher();
    }
    
}
