import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){
        String ligne;
        Scanner entree = new Scanner(System.in);//ouverture scanner

        System.out.println("Tapez une ligne");
        ligne = entree.next();

        int taille = ligne.length();
        char lettre1;
        char lettre2;
        int entierlettre1;
        int entierlettre2;

        String reponse = "Palindrome";
        
        for (int i=1; i < taille-1; i++){
            lettre1 = ligne.charAt(i-1);
            lettre2 = ligne.charAt(taille-i);
            if(lettre1 != lettre2)
            {
                reponse = "Pas palindrome";
            } 
        }
        System.out.println(reponse);
    }

}