import java.util.*;

abstract class Employe {
    protected String nom;
    protected int age;
    protected int nb_A;
    protected int idd;

    public static int count =0;

    public Employe (String  nom, int age, int nb_A){
        this.nom = nom;
        this.age = age;
        this.nb_A = nb_A;
        this.idd=count;
        count++;
    }

    public abstract double salaire();

    public abstract String categorie();

    public String toString(){
        return this.categorie();
    }

    public void affiche (){
        System.out.println(this.toString());
    }


}