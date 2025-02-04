public class TestVoiture{

    public static void main(String[] args){
        Voiture[] voitures = new Voiture[3];
        voitures[0] = new Voiture(marque:"BMW", vitesse:220, kilometres:8);
        voitures[1] = new Voiture(marque:"Ford", vitesse:200, kilometres:6);
        voitures[2] = new Voiture(marque:"Audi", vitesse:240, kilometres:8);

        for (Voiture v : voitures){
            System.out.println(v);
        }
        System.out.println("Le nombre des voitures est : "+Voiture.getCount());
    }
}