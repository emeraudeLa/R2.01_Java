import java.util.Scanner;
public class Saisie {
    public static int entier(Scanner scan){
        String tmp=scan.next();
        return Integer.parseInt(tmp);}
    public static double reeld(Scanner scan){
        String tmp = scan.next();
        Double d=Double.valueOf(tmp);
        return d.doubleValue();
    }
    public static double reelf(Scanner scan){
        String tmp = scan.next();
        Float f = Float.valueOf(tmp);
        return f.floatValue();
    }
    public static String chaine(Scanner scan){return scan.next();}
    public static char car(Scanner scan){return scan.next().charAt(0);}

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int j = Saisie.entier(scan);
        System.out.println(j);
        scan.close();
    }
    
}