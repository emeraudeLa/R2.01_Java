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
            tableDom[i].afficher()
        }
    }

    public static void main(String[] args){
        System.out.println("test");
    }
}