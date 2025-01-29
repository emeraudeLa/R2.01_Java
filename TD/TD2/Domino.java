public class Domino{
    private int gauche;
    private int droite;

    //Constructeur
    public Domino(int gauche, int droite){
        this.gauche = gauche;
        this.droite = droite;
    }
    //Getters
    public int getGauche(){return gauche;}
    public int getDroite(){return droite;}
    //Setters
    //public void setGauche(int gauche){this.gauche=gauche;}
    @Override
    public String toString(){return "("+gauche+" | "+droite+")";}
    public void afficher(){System.out.println(toString());}
    public void inverser(){//inverse le domino
        int tmp;
        tmp=gauche;
        gauche=droite;
        droite=tmp;
    }
}