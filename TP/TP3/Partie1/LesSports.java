import java.util.*;

public class LesSports {
    private ArrayList<Sport> tabSport = new ArrayList<Sport>(50);

    public LesSports(int n){
        tabSport = new ArrayList<>(n);
    }

    public void initTable(Sport sport){
        tabSport.add(sport);
    }

    public void affTable(){
        for (int i=0;i<tabSport.size();i++){
            tabSport.get(i).afficher();
        }
    }
}