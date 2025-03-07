class Cercle extends FormeGeometrique implements Dessinable{

    private int rayon;

    public Cercle (double x, double y, int rayon){
        super(x, y);
        this.rayon=rayon;
    }

    public double surface(){
        return this.rayon*this.rayon*3.14;
    } 
    public double perimetre(){
        return 2*3.14*this.rayon;
    }

    public void dessiner (String couleur){
        System.out.println("Type : Cercle, couleur : "+couleur);
    }
}