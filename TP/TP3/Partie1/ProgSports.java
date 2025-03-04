public class ProgSports {
    private static final int max = 50;
    public static void main(String[] args){
        LesSports sports = new LesSports(max);

        SportCo volley = new SportCo("A1","Volley",6);
        SportCo foot = new SportCo("A2","Football",12);
        SportCo bad = new SportCo("A3","Badmminton (duo)",2);
        Sport danse = new Sport("B1","Danse");
        Sport badmin = new Sport("B3","Badminton (simple)");

        sports.initTable(volley);
        sports.initTable(foot);
        sports.initTable(bad);
        sports.initTable(danse);
        sports.initTable(badmin);

        sports.affTable();
    }
}