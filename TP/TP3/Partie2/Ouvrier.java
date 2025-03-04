class Ouvrier extends Employe {
    
    private int nb_H_O;

    public Ouvrier (String  nom, int age, int nb_A){
        super(nom,age,nb_A);
        this.nb_H_O=35;
    }
}