public class CorVoiture {
    private int id;
    private String marque;
    private double vitesse;
    private double kilometres;

    public static int count =0;

    public CorVoiture (String marque, double vitesse, double kilometres){
        this.id = count;
        count++;
        this.marque = marque;
        this.vitesse=vitesse;
        this.kilometres = kilometres;
    }
    public CorVoiture (){
        this.id=count();
        count++;
        marque = "Peugeot";
        vitesse = 0;
        kilometres = 0;
        /*autre ecriture
        this(marque:"Peugeot", vitesse:0, kilometres:0);
        */
    }
    @Override 
    public String toString(){
        return "id="+id+", marque="+marque+", vitesse="+vitesse+", kilometres="+kilometres;
    }
    public int getId(){return id;}
    public String getMarque(){return marque;}
    public double getVitesse(){return vitesse;}
    public void setVitesse(double vitesse){this.vitesse=vitesse;}
    public double getKilometre(){return kilometres;}
    public void setKilometres(int kilometres){this.kilometres=kilometres;}
}