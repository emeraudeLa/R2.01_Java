import java.util.ArrayList;

public class Voiture {
    private String immatriculation;
    private String modele;
    private int kilometres;
    private float tarif;

    public Voiture (String immatriculation, String modele, int kilometres, float tarif){
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.kilometres=kilometres;
        this.tarif = tarif;
    }
    //Getters
    public String getImmatriculation(){return immatriculation;}
    public String getModele(){return modele;}
    public int getKilometres(){return kilometres;}
    public float getTarif(){return tarif;}

    public String toString(){
        return "immatriculation="+immatriculation+", modele="+modele+", kilometres parcourus="+kilometres+", tarif de location="+tarif;
    }

    public static void main(String[] args){
        ArrayList<Voiture> listeVoitures =new ArrayList<Voiture>(10);
        Voiture voit = new Voiture("AZ 567 AG","Picanto",6578,5000);
        listeVoitures.add(voit);
        Voiture voit2 = new Voiture("YT 681 IG","Ford",7246,10528);
        listeVoitures.add(voit2);
        System.out.println(listeVoitures.get(0)+"\n"+listeVoitures.get(1));
        listeVoitures.remove(0);
        System.out.println("Table apres del : "+listeVoitures.get(0));

        /*//version iterative
        Iterator<Voiture> it = mesVoit.iterator();
        while(it.hasNext()){
            mv = it.next();
            mv.affiche();
        }*/
    }
}
