import java.util.Scanner;//importe le Scanner

public class Saisir {
    //Méthode de classe
    static public int entier(){
        String ligne;
        Scanner entree = new Scanner (System.in);
        // saisie d'une ligne
        System.out.println("Tapez une ligne");
        ligne = entree.next();
        return int(ligne);
    }

    static public int reeld(){

    }

    static public int reelf(){

    }

    static public int chaine(){

    }

    static public int car(){

    }
}