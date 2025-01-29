import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args){
        String[] mois = { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre" };
        String[] jSem = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };

        //Q1
        System.out.println(System.currentTimeMillis());

        //Q2
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH)+1;
        int year = c.get(Calendar.YEAR);
        int date = c.get(Calendar.DATE);
        int day = (c.get(Calendar.DAY_OF_WEEK)-1)%7;
        System.out.println("Nous sommes le "+day+" eme jour de la semaine, le "+date+"/"+month+"/"+year);
        System.out.println("Nous sommes "+jSem[day-1]+", le "+date+" "+mois[month-1]+" "+year);
    
        //Version 2
        ArrayList<String> listeJoursSemaine =new ArrayList<String>();

        listeJoursSemaine.add("lundi"); //faire pour chaque jours, mais c'est long

        listeJoursSemaine = new ArrayList<String>(Arrays.asList(jSem));

        System.out.println(listeJoursSemaine.get(day-1)+" "+date+" "+mois[month-1]+" "+year);




        //Q3
        Date d = new Date();
        SimpleDateFormat f1=new SimpleDateFormat("dd MMMMM yyyy HH:mm");
        SimpleDateFormat f2=new SimpleDateFormat("dd MM yy HH:mm:ss");
        SimpleDateFormat f3=new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss");

        System.out.println("maintenant: ");
        System.out.println(f1.format(d));
        System.out.println(f2.format(d));
        System.out.println(f3.format(d));
    }

}