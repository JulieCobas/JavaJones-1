
import java.util.Scanner;
public class Jeu {
    public static void main(String[] args) {
        /** Ouverture du scanner pour la saisie */
        Scanner scanner = new Scanner(System.in);

        /** Message du début */
        System.out.println("\nBonjour aventurer ! Comment vous appelez vous ?");

        /** Lecture du nom du joueur en enlevant les espaces et mettre en minuscule*/

        /** Création du joueur */
        String nomJoueur = scanner.nextLine().trim().toLowerCase();
        Personnage joueur = new Personnage(nomJoueur);
        joueur.getBarreDeVie();
        joueur.getPorteMonnaie();

        /** Message de confirmation du joueur */
        System.out.println("\nBienvenue dans la quête " + joueur.getNomJoueur());
        scanner.close();
    }
}
