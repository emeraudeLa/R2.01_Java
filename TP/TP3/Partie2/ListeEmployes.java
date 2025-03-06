import java.util.*;
class ListeEmployes {
    private ArrayList<Employe> tabEmploye = new ArrayList<Employe>(50);

    public ListeEmployes (int n){
        tabEmploye = new ArrayList<>(n);
    }

    public void ajoutEmploye (Employe emp){
        tabEmploye.add(emp);
    }
    
    public void affiche(){
        for (int i=0; i<tabEmploye.size();i++){
            tabEmploye.get(i).affiche();
        }
    }

    public void afficheEmploye(Employe e){
        e.affiche();
    }

    public void trierEmployes (){
        ArrayList<Employe> listTrier = (ArrayList<Employe>) tabEmploye.clone();
        listTrier.sort((e1,e2) -> Double.compare(e2.salaire(), e1.salaire()));
        for (Employe e : listTrier){
            e.affiche();
        }
    }

    //public ListeEmployes selectionner(){

    //}

}