class Gerant extends Employe {
    
    private int nb_H_G;

    public Gerant (String  nom, int age, int nb_A){
        super(nom,age,nb_A);
        this.nb_H_G=30;
    }
}