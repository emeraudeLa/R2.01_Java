import java.util.ArrayList;
public class Table{
    private ArrayList<Domino> tableDom = new ArrayList<Domino>(28);
    //Constructeur
    public Table(int n){
        tableDom = new ArrayList<>(n);
    }
    public void initTable(Domino dom){
        tableDom.add(dom);
    }

    public void affTable(){
        for (int i=0;i<tableDom.size();i++){
            tableDom.get(i).afficher();
        }
    }
    public int recherche(int g, int d){
        int resultat = 0;
        if(tableDom.get(0).getGauche()==d){
            resultat=-1;
        }
        else if (tableDom.get(tableDom.size()-1).getDroite()==g){//prend la valeur a droite du domino le plus a droite (size -1) et compare avec le cote gauche du dom
            resultat=1;
        }
        return resultat;
    }

    public void poserAgauche(Domino dom){
        tableDom.add(0,dom);
    }

    public void poserAdroite(Domino dom){
        tableDom.add(dom);
    }

    public static void main(String[] args){
        Domino d1 = new Domino(2, 4);
        Domino d2 = new Domino(4, 5);
        Domino d3 = new Domino(5, 3);
        Domino d4 = new Domino(3, 6);
        Domino d5 = new Domino(6, 1);
        Domino d6 = new Domino(1, 2);
        Table t = new Table(6);
        t.initTable(d1);
        t.poserAdroite(d2);
        t.poserAdroite(d3);
        t.poserAdroite(d4);
        t.poserAdroite(d5);
        t.poserAdroite(d6);
        t.affTable();
    }
}
