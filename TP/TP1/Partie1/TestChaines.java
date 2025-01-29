//Ex 3
import java.util.Scanner;

public class TestChaines {

    public static void main(String[] args){

        //Q1
        /*
        int nb=12345;//variable
        String.valueOf(nb);//transforme en string
        System.out.println(nb);//print
        */

        //Q2
        /*
        Scanner chaine=new Scanner(System.in);//lecture au clavier
        String st = chaine.next();//st de type String prend valeur du clavier
        System.out.println(st);//print
        int n=Integer.decode(st);//met dans var n et transforme en entier
        n=n+1;//ajoute 1
        System.out.println(n);
        chaine.close();//ferme le scanner
        */

        //Q3
        /*
        Scanner chaine=new Scanner(System.in);//lecture au clavier
        String st = chaine.next();
        Float fl = Float.parseFloat(st);
        //System.out.println(fl);//print
        fl=fl+1.1f;//ajoute 1.1 (mettre f pour dire que c'est un flottant)
        System.out.println(fl);
        chaine.close();//ferme le scanner
        */

        //Q4
        /*
        Scanner sc = new Scanner(System.in);

        String chaine = sc.next();
        String ch= chaine.strip();
        String c= ch.toUpperCase();
        System.out.println(c);

        sc.close();
        */

        //Q5
        System.out.println("Char 1 : ");
        Scanner sc1 = new Scanner(System.in);
        String chaine1 = sc1.next();

        System.out.println("Char 2 : ");
        Scanner sc2 = new Scanner(System.in);
        String chaine2 = sc2.next();

        char c1 =  chaine1.charAt(0);
        char c2 =  chaine2.charAt(0);

        String reponse = "Meme char";

        if(c1 != c2)
            {
                reponse = "Pas meme char";
            }

        System.out.println(reponse);

    }
}