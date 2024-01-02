
import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {

        Labyrinthe labyrinthe = new Labyrinthe();

        /** Ouverture du scanner pour la saisie */
        Scanner scanner = new Scanner(System.in);

        /** Message d'introduction */
        System.out.println("\n");
        System.out.println("===========================================================");
        System.out.println(" Aventure de JavaJones : La Quête du Crâne de Cristal");
        System.out.println("===========================================================");
        System.out.println("Bienvenue, aventurier intrépide, dans un monde de mystères et de périls !");
        System.out.println("Vous incarnez JavaJones, un explorateur audacieux, déterminé à dévoiler les secrets");
        System.out.println("du labyrinthe ancien et à récupérer le légendaire Crâne de Cristal.");
        System.out.println("\nChaque salle du labyrinthe est un nouveau défi, avec ses ennemis à combattre,");
        System.out.println("ses trésors à découvrir et ses mystères à résoudre.");
        System.out.println("Votre courage, votre stratégie et vos choix détermineront le sort de JavaJones.");
        System.out.println("Préparez-vous pour une aventure où chaque pas peut être décisif.");
        System.out.println("\nMais avant de vous lancer dans cette quête épique...");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Dites-nous, comment vous appelez-vous, brave aventurier :");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Nom d'aventurier : ");

        /** Demande nom du joueur */
        String nomJoueur = "";
        while (nomJoueur.isEmpty()){
            nomJoueur = scanner.nextLine().trim().toLowerCase();
        }
        if(nomJoueur.isEmpty()){
            System.out.println("\nLe nom de joueur est vide ! Veuillez entrer un nom valide. ");
        }

        /** Création du joueur*/
        Personnage joueur = new Personnage(nomJoueur);

        /** Message de confirmation du joueur */
        System.out.println("\nBienvenue dans la quête " + joueur.getNomJoueur());

        /** Choix de l'arme de début */
        String reponseArmeDebut = "";
        while (!reponseArmeDebut.equals("lasso") && !reponseArmeDebut.equals("couteau")) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Avec quelle arme voulez-vous débuter ? Le lasso ou le couteau à beurre ? (lasso/couteau)");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Nom de l'arme : ");
            reponseArmeDebut = scanner.nextLine().trim().toLowerCase();
            if (reponseArmeDebut.equals("lasso")) {
                joueur.setArme(Labyrinthe.arme1);
                System.out.println("Vous avez choisi le lasso comme arme.");
            } else if (reponseArmeDebut.equals("couteau")) {
                joueur.setArme(Labyrinthe.arme2);
                System.out.println("Vous avez choisi le couteau à beurre comme arme de départ.");
            } else {
                System.out.println("Choix non valide, veuillez choisir entre 'lasso' et 'couteau'.");
            }
        }

        /** Arrivée dans la 1ère salle - obligatoire */
        joueur.setPositionActuelle(labyrinthe.getPiece(1));
        System.out.println("position :" + joueur.getPositionActuelle().getNomPiece());
        joueur.afficherEtat();
        labyrinthe.getPiece(1).afficherDescriptionPiece();
        labyrinthe.getPiece(1).afficherChoixPiece();


    }
    }

