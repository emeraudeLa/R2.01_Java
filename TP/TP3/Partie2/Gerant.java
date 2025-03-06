class Gerant extends Employe {
    
    private int nb_H_G;

    public Gerant (String  nom, int age, int nb_A){
        super(nom,age,nb_A);
        this.nb_H_G=30;
    }

    public double salaire(){
        return 5*this.nb_H_G*(20+this.nb_A/2);
    }

    public String categorie(){
        return "Categorie : Gerant, numero : "+nb_A+" nom : "+nom+" age : "+age;
    }
}