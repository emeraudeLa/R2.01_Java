import java.util.*;

public class ListeRectangles {
    private ArrayList<Rectangle> listeR = new ArrayList<Rectangle>(50);


    public void ajouter(Rectangle r){
        listeR.add(r);
    }

    public void affiche(){
        for (int i=0; i<listeR.size();i++){
            System.out.println(listeR.get(i)); ;
        }
    }

    public void trier (){
        Collections.sort(listeR);
    }

    public static void main(String[] args){
        
    }

}