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
    }
}