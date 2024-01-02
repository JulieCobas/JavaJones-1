
import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {

        Labyrinthe labyrinthe = new Labyrinthe();

        /** Ouverture du scanner pour la saisie */
        Scanner scanner = new Scanner(System.in);

        /** Message du début */
        System.out.println("\nBonjour aventurer ! Comment vous appelez vous ?");

        /** Lecture du nom du joueur en enlevant les espaces et mettre en minuscule*/

        /** Création du joueur */
        String nomJoueur = scanner.nextLine().trim().toLowerCase();
        Personnage joueur = new Personnage(nomJoueur);

        /** Message de confirmation du joueur */
        System.out.println("\nBienvenue dans la quête " + joueur.getNomJoueur());

        /** Choix de l'arme de début */
        System.out.println("\n Avec quelle arme voulez-vous débuter ? Le lasso ou le Couteau a beurre ? lasso/couteau");
        String reponseArmeDebut = "";
        while (!reponseArmeDebut.equals("lasso") && !reponseArmeDebut.equals("couteau")) {
            System.out.println("\nAvec quelle arme voulez-vous débuter ? Le lasso ou le couteau à beurre ? (lasso/couteau)");
            reponseArmeDebut = scanner.nextLine().trim().toLowerCase();

            if (reponseArmeDebut.equals("lasso")) {
                joueur.setArme(Labyrinthe.arme1);
                System.out.println("Vous avez choisi le lasso comme arme.");
            } else if (reponseArmeDebut.equals("couteau")) {
                joueur.setArme(Labyrinthe.arme2);
                System.out.println("Vous avez choisi le couteau à beurre comme arme.");
            } else {
                System.out.println("Choix non valide, veuillez choisir entre 'lasso' et 'couteau'.");
            }
        }
    }
}
