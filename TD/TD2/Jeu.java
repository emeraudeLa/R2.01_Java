import java.util.Scanner;
public class Jeu{
    static private int tailleJeu = 28;
    public static void main(String[] args){
        Table t = new Table(tailleJeu);
        Scanner sc = new Scanner(System.in);
        int domGau=-2;
        int domDroi=-2;
        int rechercher=0;

        //ajout domino de depart
        while (domGau < -1 || domGau > 6){
            System.out.println("Donnez valeur gauche du domino de départ : ");
            domGau = sc.nextInt();
            if(domGau < -1 || domGau > 6){
                System.out.println("Erreur, valeur entrée non conforme");
            }
        }
        
        while (domDroi < -1 || domDroi > 6){
            System.out.println("Donnez valeur droite du domino de départ : ");
            domDroi = sc.nextInt();
            if(domDroi < -1 || domDroi > 6){
                System.out.println("Erreur, valeur entrée non conforme");
            }
        }
        Domino domino = new Domino(domGau,domDroi);
        t.initTable(domino);
        System.out.println("Etat initial de la table :");
        t.affTable();

        while(t.size()!=tailleJeu){//boucle ajout dominos
            while (domGau < -1 || domGau > 6){
                System.out.println("Donnez valeur gauche du domino de départ : ");
                domGau = sc.nextInt();
                if(domGau < -1 || domGau > 6){
                    System.out.println("Erreur, valeur entrée non conforme");
                }
            }
        
            while (domDroi < -1 || domDroi > 6){
                System.out.println("Donnez valeur droite du domino de départ : ");
                domDroi = sc.nextInt();
                if(domDroi < -1 || domDroi > 6){
                    System.out.println("Erreur, valeur entrée non conforme");
                }
            }

            Domino dom = new Domino(domGau,domDroi);
            rechercher=t.recherche(domGau,domDroi);//cherche ou mettre le domino
            if(rechercher==-1){
                t.poserAgauche(dom);
            }
            else if(rechercher==1){
                t.poserAdroite(dom);
            }
            System.out.println("Etat actuel de la table :");
            t.affTable();
        }
        sc.close();
    }
}