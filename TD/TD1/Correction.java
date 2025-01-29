import java.util.Scanner;

public class Correction {

    public static void main(String[] args){
        final int DECALAGE = 2;//const int
        StringBuffer buff;
        char car;
        int i, pos, longueur;
        String ligne;
        Scanner entree = new Scanner(System.in);//ouverture scanner


        /*********** Exercice 1 ***********/
        System.out.println("Tapez une ligne");
        ligne = entree.nextLine();
        buff = new StringBuffer(ligne);
        for (i=0; i<buff.length();i++){
            car = buff.charAt(i);
            car = Character.toLowerCase(car);
            pos = (int)car - (int)'a';
            pos = (pos + DECALAGE) % 26;
            car = (char)((int)'a'+pos);
            buff.setCharAt(i,car);
        }
        ligne = new String (buff);
        System.out.println("Chaine codee ="+ligne);
    }

}