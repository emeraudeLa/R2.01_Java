class Ouvrier extends Employe {
    
    private int nb_H_O;

    public Ouvrier (String  nom, int age, int nb_A){
        super(nom,age,nb_A);
        this.nb_H_O=35;
    }

    public double salaire(){
        return 4*this.nb_H_O*(10+this.nb_A/2);
    }

    public String categorie(){
        return "Categorie : Ouvrier, numero : "+nb_A+" nom : "+nom+" age : "+age;
    }
}