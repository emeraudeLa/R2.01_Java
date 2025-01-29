//Ex 3
import java.util.Scanner;//importe le Scanner

public class Correction {

    public static void main(String[] args){

        //Q1
        
        int n=12345;
        String chaine = String.valueOf(n);
        System.out.println(chaine);
        //System.out.println(n);
        

        //Q2
        
        Scanner sc = new Scanner(System.in);

        String chaine = sc.next();
        int n = Integer.parseInt(chaine);
        System.out.println(n);
        n = n+1;
        System.out.println(n);

        sc.close();

        //Q3

        Scanner sc = new Scanner(System.in);

        String chaine = sc.next();
        float n = Float.parseFloat(chaine);
        System.out.println(n);
        n = n+1.1f;
        System.out.println(n);

        sc.close();

        //Q4

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nom de ville :");
        String ville = sc.next();
        ville = ville.strip().toUpperCase();
        System.out.println(ville);

        sc.close();

        //Q5

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez une premiere chaine :");
        String s1 = sc.nextLine();
        System.out.println("Entrez une deuxieme chaine :");
        String s2 = sc.nextLine();

        if(s1.charAt(0) == s2.charAt(0)){
            System.out.println("Les premiers caracteres des deux cahines sont egaux");
        }
        else{
            System.out.println("Les premiers caracteres des deux cahines ne sont pas egaux");
        }

        sc.close();


        //Q6

        /*pour comparer deux cahine de carac : 
        
        String chaine1 = "toto";
        String chaine2 = "toto";

        pas faire : chaine1 == chaine2
        faire : chaine1.equals(chaine2)
        */
        

        //Q7

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez une premiere chaine :");
        String s1 = sc.nextLine();
        System.out.println("Entrez une deuxieme chaine :");
        String s2 = sc.nextLine();

        System.out.println("s1 commence-t-elle par s2 ?" + s1.startsWith(s2));
        System.out.println("s1 contient-elle s2?" + s1.contains(s2));
        System.out.println("s1 finit-elle par S2?" + s1.endsWith(s2));

        sc.close();

        //Q8
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez une premiere chaine :");
        String s1 = sc.nextLine();
        System.out.println("Entrez une deuxieme chaine :");
        String s2 = sc.nextLine();

        if(s1.contains(s2)){
            int premier_s2 = s1.indexOf(s2,0);
            System.out.println(s1.substring(0,premier_s2) + 
                s1.substring(premier_s2 + s2.length(),s1.length()));
        }
        else{
            System.out.println(s1);
        }
        sc.close();



        /***************Exercice 4******************/

        Scanner sc = new Scanner(System.in);
        Boolean sortie = false;
        String saisie;
        char choix_utilisateur;
        Double nb,res;
        while(!sortie){
            System.out.println("C : Calcul d'un cosinus");
            System.out.println("S : Calcul d'un sinus");
            System.out.println("T : Calcul d'une tangente");
            System.out.println("Q : Quitter le programme");

            saisie = scan.nextLine();
            choix_utilisateur= saisie.charAt(0);
        }
        switch (choix_utilisateur){
            case 'C':
                System.out.println("Entrez un angle en radian :");
                nb = Double.valueOf(scan.nextLine());
                res = Math.cos(nb);
                System.out.println("Cosinus = "+ res.doubleValue());
                break;

            case 'S':
                System.out.println("Entrez un angle en radian :");
                nb = Double.valueOf(scan.nextLine());
                res = Math.sin(nb);
                System.out.println("Sinus = "+ res.doubleValue());
                break;

            case 'T':
                System.out.println("Entrez un angle en radian :");
                nb = Double.valueOf(scan.nextLine());
                res = Math.tan(nb);
                System.out.println("Tangente = "+ res.doubleValue());
                break;

            case 'Q':
                sortie = true;
                break;
            
            default:
                System.out.println("Erreur de saisie, veuillez recommencer");
                break;
        }

    }
}