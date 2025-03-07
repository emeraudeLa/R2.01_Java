class Rectangle extends FormeGeometrique implements Dessinable, Comparable{

    private int hauteur;
    private int largeur;

    public Rectangle (double x, double y, int hauteur, int largeur){
        super(x, y);
        this.largeur=largeur;
        this.hauteur=hauteur;
    }

    public double surface(){
        return this.hauteur*this.largeur;
    } 
    public double perimetre(){
        return (this.hauteur+this.largeur)*2;
    } 

    public void dessiner (String couleur){
        System.out.println("Type : Rectangle, couleur : "+couleur);
    }

    public int compareTo (Object autre){
        int resultat=-100000;
        double surface1, surface2;
        if (autre instanceof Rectangle){
            surface1 = this.surface();
            surface2 = ((Rectangle)autre).surface();
            if (surface1>surface2){
                resultat=1;
            }
            else if (surface1==surface2){
                resultat=0;
            }
            else{
                resultat=-1;
            }
        }
        
        return resultat;
    }
}