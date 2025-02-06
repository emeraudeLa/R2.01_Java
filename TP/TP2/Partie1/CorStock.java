import java.util.Scanner;
public class CorStock{
    private int dateJ;
    private Pile pile;
    public Stock(int taille){
        this.pile= new Pile(taille);
        this.dateJ=1;
    }
    public void entrer(Produit p){this.pile.empiler(p);}
    public void sortir(int dateJour){
        Produit p =this.pile.sommet();
        if (p!=null && p.getDateEntree()>dateJour + 5){
            System.out.println("Produit "+ p.getReference()+" Périmé, stock intégralement");
            while(!this.pile.pileVide()){
                this.pile.depiler();
            }

        }else{
            this.pile.depiler();
            Sytem.out.println("Produit "+p.getReference()+" sorti du stock");
        }
    }
    public Pile getPile(){return pile;}
    public void sortPile(Pile pile){this.pile=pile;}
    public void afficheMenu(Scanne sc){
        boolean stop= false;
        while(!stop){
            System.out.println("e : entree d'un produit dans le stock;\n"+
            "s : sortie d'un produit du stock;\n"+
            "i: incrementer la date du jour;\n"+
            "q: quitter.\n"+
            "")
            System.out.println("Que voulez vous faire ?");
            String reponse = sc.nextLine();
            switch (reponse){
                case "e": this.entrer(new Produit(dateJ, sc));
                break;
                case "s": this.sortir(dateJ);
                break;
                case "i": dateJ++;
                break;
                case "q" : stop=true;
                break;

            }
        }
    }
}
