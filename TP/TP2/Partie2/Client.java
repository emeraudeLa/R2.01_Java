public class Client {
    private int numero;
    private String nom;
    private String domicile;

    public static int count =0;

    public Client (String nom, String domicile){
        this.numero = count;
        count++;
        this.nom = nom;
        this.domicile=domicile;
    }

    public int getNumero(){return numero;}
    public String getNom(){return nom;}
    public String getDomicile(){return domicile;}

    public String toString(){
        return "numero="+numero+", nom="+nom+", domicile="+domicile;
    }

    public static void main(String[] args){
        Client client = new Client("Martin","99 rue de Gouesnou, 29200 Brest");
        Client client2 = new Client("Reichert","4 Cité Chamoine Chapalain, 29200 Brest");
        System.out.println(client.toString()+"\n"+client2.toString());
    }

}