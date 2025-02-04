public class Pile{
    private Produit[] produits;
    private int indice;

    public Pile(int max){
        produits = new Produit[max];
        indice = -1;
    }
    public boolean pileVide(){return indice==1;}
    public boolean pilePleine(){return indice == produits.legth-1;}
    public void empiler(Produit p){
        if (pilePleine()){
            System.out.println("La pile est pleine, imposible d'empiler le produit.");
        } else {
            indice++;
            produits[indice]=p;
        }
    }
    public void depiler(){
        if(pileVide()){
            System.out.println("La pile est vide, impossible de depiler un produit");
        }else{
            indice--1;
        }
    public Produit sommet(){
        if(pileVide()){
            System.out.println("La pile est vide, il n'y a pas de produit au sommet.")
            return null;
        }else{
            return produits[indice];
        }
    }
    }
    }