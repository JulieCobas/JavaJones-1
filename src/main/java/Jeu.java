
import java.util.Scanner;

public class Jeu {
    public static void main(String[] args) {

        Labyrinthe labyrinthe = new Labyrinthe();


        /** Ouverture du scanner pour la saisie */
        Scanner scanner = new Scanner(System.in);

        /** Message d'introduction */
        System.out.println("\n===========================================================");
        System.out.println(" Aventure de JavaJones : La Quête du Crâne de Cristal");
        System.out.println("===========================================================");
        System.out.println("           ███████████████████████████\n" +
                            "           ███████▀▀▀░░░░░░░▀▀▀███████\n" +
                            "           ████▀░░░░░░░░░░░░░░░░░▀████\n" +
                            "           ███│░░░░░░░░░░░░░░░░░░░│███\n" +
                            "           ██▌│░░░░░░░░░░░░░░░░░░░│▐██\n" +
                            "           ██░└┐░░░░░░░░░░░░░░░░░┌┘░██\n" +
                            "           ██░░└┐░░░░░░░░░░░░░░░┌┘░░██\n" +
                            "           ██░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░██\n" +
                            "           ██▌░│██████▌░░░▐██████│░▐██\n" +
                            "           ███░│▐███▀▀░░▄░░▀▀███▌│░███\n" +
                            "           ██▀─┘░░░░░░░▐█▌░░░░░░░└─▀██\n" +
                            "           ██▄░░░▄▄▄▓░░▀█▀░░▓▄▄▄░░░▄██\n" +
                            "           ████▄─┘██▌░░░░░░░▐██└─▄████\n" +
                            "           █████░░▐█─┬┬┬┬┬┬┬─█▌░░█████\n" +
                            "           ████▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐████\n" +
                            "           █████▄░░░└┴┴┴┴┴┴┴┘░░░▄█████\n" +
                            "           ███████▄░░░░░░░░░░░▄███████\n" +
                            "           ██████████▄▄▄▄▄▄▄██████████\n" +
                            "           ███████████████████████████");

        System.out.println("\nBienvenue, aventurier intrépide, dans un monde de mystères et de périls !");
        System.out.println("\nVous incarnez JavaJones, un explorateur audacieux, déterminé à dévoiler les secrets du labyrinthe ancien et à récupérer le légendaire Crâne de Cristal.");
        System.out.println("Chaque salle du labyrinthe est un nouveau défi, avec ses ennemis à combattre, ses trésors à découvrir et ses mystères à résoudre.");
        System.out.println("Votre courage, votre stratégie et vos choix détermineront le sort de JavaJones.");
        System.out.println("Préparez-vous pour une aventure où chaque pas peut être décisif.");
        System.out.println("\nMais avant de vous lancer dans cette quête épique...");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Dites-nous, comment vous appelez-vous, brave aventurier :");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.print("Nom d'aventurier : ");

        /** Demande nom du joueur */
        String nomJoueur = "";
        while (nomJoueur.isEmpty()){
            nomJoueur = scanner.nextLine().trim().toLowerCase();
        }
        if(nomJoueur.isEmpty()){
            System.out.println("\nLe nom de joueur est vide ! Veuillez entrer un nom valide. ");
        }

        /** Création du joueur, position de départ, arme de départ */
        Aventurier joueur = new Aventurier(nomJoueur);
        System.out.println("\nBienvenue dans la quête " + joueur.getNom());
        joueur.setPositionActuelle(labyrinthe.getPiece(1));

        /** Choix de l'arme de début */
        String reponseArmeDebut = "";
        while (!reponseArmeDebut.equals("lasso") && !reponseArmeDebut.equals("couteau")) {
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Avec quelle arme voulez-vous débuter ? Le lasso ou le couteau à beurre ? (lasso/couteau)");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.print("Nom de l'arme : ");
            reponseArmeDebut = scanner.nextLine().trim().toLowerCase();
            if (reponseArmeDebut.equals("lasso")) {
                joueur.setArme(Labyrinthe.arme1);
            } else if (reponseArmeDebut.equals("couteau")) {
                joueur.setArme(Labyrinthe.arme2);
            } else {
                System.out.println("Choix non valide, veuillez choisir entre 'lasso' et 'couteau'.");
            }
        }

        System.out.println("\nVoici l'état actuel de votre personnage : surveillez de près votre niveau de vie, vérifiez l'arme que vous maniez actuellement, les dégâts qu'elle inflige\n"
                +"et gardez un œil sur votre sacoche de pièces d'or.\nQue la chance vous accompagne dans votre quête !\n");

        /** Logique de jeu */
        Piece pieceActuelle; //Initialiser la position actuelle de la pièce où se trouve le joueur
        boolean jeuEnCours = true; //Le jeu est par défaut en cours

        //Tant que la vie du joueur est supérieur à 0
        while (jeuEnCours && joueur.getVie() > 0 ){
            joueur.afficherEtat(); //Toujours afficher la barre d'état du joueur avant l'apparition de la salle


            //En fonction de la pièce actuelle récupérer la nouvelle position du joueur, le nom de la pièce, la description et les choix possibles dans la pièce actuelle
            pieceActuelle = joueur.getPositionActuelle();
            pieceActuelle.getNomPiece();
            pieceActuelle.afficherDescriptionPiece();
            pieceActuelle.afficherChoixPiece();

            //Demander quel choix veut faire le joueur dans la pièce
            Choix choixJoueur = pieceActuelle.demanderChoixJoueur(scanner);

            //Faire défiler les actions dans le choix sélectionné et les exécuter
            for (Action action : choixJoueur.getActions()) {
                action.exectuer(joueur);
                joueur.afficherEtat();

                // Si le joueur n'a plus de vie
                if (joueur.verifierEtatDuJeu(joueur,pieceActuelle,labyrinthe) == false){ //Faux -> Le joueur est perdant ou gagnant de la partie
                 jeuEnCours = false; //Le jeu n'est plus en cours
                 break; // Le jeu s'arrête
                }
            }

            if(jeuEnCours == true){ //Le jeu continu
            joueur.seDeplacer(labyrinthe); //Il peut se déplacer
            }
        }
       scanner.close();
    }
}

