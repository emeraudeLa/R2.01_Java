import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

        String ligne;
        Scanner entree = new Scanner(System.in);//ouverture scanner

        // 1) Récupérer la chaine (entrée au clavier par l'user)
        System.out.println("Tapez une ligne");
        ligne = entree.next();

        //2) Transformer la chaine en StringBuffer
        StringBuffer buffer = new StringBuffer(ligne);

        //3) Parcourir le StringBuffer caractère par caractère et coder le message
        int taille = buffer.length();
        char lettre;
        int entierlettre;
        
        for (int i=0; i < taille; i++){
            lettre = buffer.charAt(i);

            entierlettre = (int)lettre - (int)'a';
            entierlettre = (entierlettre + 2)%26;
            lettre = (char) (entierlettre + (int)'a');

            buffer.setCharAt​(i, lettre);   
        }
        
        //4) Retransformer le StringBuffer en String
        ligne = new String(buffer);

        //5) Afficher
        System.out.println(ligne);

        entree.close();//ferme le scanner
    }

}