import java.util.*;

public class Location {
    private int num;
    private Voiture voit;
    private Client cli;
    private Date depart;
    private Date retour;
    private int km;

    public static int numero=0;

    public Location (Voiture voit, Client cli, Date depart){
        numero=numero+1;
        this.num=numero;
        this.voit = voit;
        this.cli = cli;
        this.depart = depart;
        this.retour=null;
        this.km=0;
    }

    public void afficher(){
        System.out.println("Num :"+num+"\nVoiture :"+voit.toString()+"\nClient :"+cli.toString()+"\nDate depart");
        depart.afficher();
        System.out.println("Date retour:");
        if(retour==null){
            System.out.println("Location en cours");
        }else{
            retour.afficher();
        }
    }

    public static void main(String[] args){
        Voiture tutut = new Voiture("AZ 567 AG","Picanto",6578,5000);
        Client clicli = new Client("Martin","29200 Brest");
        Date day = new Date(6,2,2025);
        Location loc = new Location(tutut,clicli, day);
        loc.afficher();

    }

}