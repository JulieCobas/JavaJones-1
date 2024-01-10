import java.util.*;

public class Labyrinthe {

    /** VARIABLES D'INSTANCES */
    private final List<Piece> pieces;
    public static Arme arme1 = new Arme("Lasso", 5, 0);
    public static Arme arme2 = new Arme("Couteau a Beurre", 6, 0);
    private Ennemi boss;

    /** CONSTRUCTEUR */
    public Labyrinthe() {
        pieces = new ArrayList<>();
        initialisation();
    }

    private void initialisation() {

        /** Initialisation des pièces */
        Piece piece1 = new Piece("🕯️🕯️🕯️🕯️      L'ENTRÉE MAUDITE      🕯️🕯️🕯️🕯️",
                "L'air se rafraîchit soudainement alors que vous pénétrez dans L'Entrée Maudite, " +
                        "une grotte sombre et imposante. Des stalactites pendent du plafond comme d'anciens " +
                        "gardiens de pierre, et chaque goutte d'eau qui tombe résonne dans l'obscurité, " +
                        "telle une horloge égrenant le temps oublié. Le sol est irrégulier, parsemé de roches " +
                        "et de fossiles, témoins silencieux d'un passé lointain. Des ombres dansent sur les " +
                        "parois à la lueur de votre torche, suggérant des formes et des mouvements furtifs.",
                1, false);

        Piece piece2 = new Piece("🌳🦉♟️️       LE JARDIN DES STATUES           🌳🦉♟️",
                "Vous arrivez dans cet espace ouvert, parsemé d'impressionnantes statues en pierre, " +
                        "certaines érodées par le temps, d'autres étonnamment préservées. Chaque statue représente un " +
                        "personnage ou une créature mythique, figée dans la pierre. La végétation a repris ses droits ici, " +
                        "avec des lierres grimpants et des fleurs sauvages qui ajoutent une touche de couleur. La nuit, " +
                        "des hiboux observent depuis les branches, et le clair de lune donne vie aux statues, créant une " +
                        "atmosphère à la fois belle et inquiétante.",
                3, false);

        Piece piece3 = new Piece("💀💀        LA CHAMBRE DES OMBRES CHUCHOTANTES       👻👻",
                " Vous entrez dans une chambre où les murs sont couverts de fresques anciennes, " +
                        "dépeignant des scènes énigmatiques et des figures fantomatiques. Un murmure constant," +
                        "presque imperceptible, imprègne l'air, comme si les ombres elles-mêmes partageaient des " +
                        "secrets anciens. Des bougies éparses, dont la flamme vacille, projettent des ombres mouvantes " +
                        "qui semblent chuchoter entre elles. Le sol est jonché de fragments de pierres anciennes, et " +
                        "l'atmosphère est lourde d'un mystère palpable.",
                2, false);

        Piece piece4 = new Piece("🕸️️🪦        LE SANCTUAIRE OUBLIE               ️🪦🕸️️",
                "Après avoir traversé le jardin, vous arrivez dans un lieu de repos éternel, avec des sarcophages de pierre alignés le long des " +
                        "murs. Des toiles d'araignée recouvrent les recoins, et la poussière du temps rend l'air dense et " +
                        "silencieux. Des inscriptions et des symboles mystérieux sont gravés sur les sarcophages, et au " +
                        "centre de la pièce trône un autel orné de gemmes. Un sentiment de respect et de crainte se dégage " +
                        "de cet endroit, comme si chaque pas perturbait un silence ancestral.",
                4, false);

        Piece piece5 = new Piece("🪞🪞        LA GALERIE DES ILLUSIONS            🪞🪞",
                "Vous arrivez maintenant dans un couloir bordé de miroirs de toutes formes et tailles. Chaque miroir " +
                        "reflète une image différente, certaines réalistes, d'autres complètement déformées ou fantastiques. " +
                        "Il est difficile de distinguer ce qui est réel de ce qui est illusion, et les reflets semblent " +
                        "parfois bouger de leur propre volonté. Des lumières douces et changeantes créent une atmosphère " +
                        "onirique, rendant la navigation à travers cette galerie à la fois fascinante et déroutante.",
                5, false);

        Piece piece6 = new Piece("👑🧘        LA SALLE DU TRÔNE DU GARDIEN       🧘👑",
                " Vous entrez maintenant dans la pièce la plus majestueuse du labyrinthe. Un grand trône, orné de " +
                        "pierres précieuses, domine la salle. Des tapisseries riches et colorées décorent les murs, " +
                        "racontant l'histoire du gardien du labyrinthe. De grandes fenêtres laissent entrer une lumière " +
                        "naturelle, donnant à la pièce une atmosphère à la fois solennelle et accueillante. C'est ici que " +
                        "le gardien surveille et contrôle le labyrinthe, et c'est également ici que se trouvent de nombreux " +
                        "secrets et trésors cachés.",
                6, true);


        /** Création des coffres */
        Coffre gain1 = new Coffre("Coffre de pièces en argent", 5);
        Coffre gain2 = new Coffre("Coffre d'Emeraudes", 20);
        Coffre gain3 = new Coffre("Coffre de Saphirs", 20);
        Coffre gain4 = new Coffre("Coffre d'Or Pur", 40);
        Coffre gain5 = new Coffre("Coffre de diamants et de rubis", 100);


        /** Création d'ennemis */
        Ennemi ennemi1 = new Ennemi("des serpents 🐍", 5, 5);
        Ennemi ennemi2 = new Ennemi("des spectres glaciales 👻", 10, 10);
        Ennemi ennemi3 = new Ennemi("des ", 0, 20);
        Ennemi ennemi4 = new Ennemi("des chauves-souris hurlantes 🦇🦇", 10, 20);
        Ennemi ennemi5 = new Ennemi("des loups-garous", 0, 25); // A MODIFIER
        Ennemi ennemi6 = new Ennemi("des gargouilles de pierre 🗿", 25, 30);
        Ennemi ennemi7 = new Ennemi("des hommes en feu 🔥", 20, 25);
        Ennemi ennemi8 = new Ennemi("une araignée géante 🕷️🕸️", 30, 45);
        boss = new Ennemi("Gardien du crâne de Cristal", 100, 100);


        /** Création des armes */
        Arme arme3 = new Arme("Parapluie", 8, 3);
        Arme arme4 = new Arme("Baguette Magique", 10, 5);
        Arme arme5 = new Arme("Arme5", 15, 10);
        Arme arme6 = new Arme("Arme5", 15, 10);
        Arme arme7 = new Arme("Arme5", 15, 10);
        Arme arme8 = new Arme("Arme5", 15, 10);
        Arme arme9 = new Arme("Arme5", 15, 10);
        Arme arme10 = new Arme("Arme5", 15, 10);
        Arme arme11 = new Arme("Arme5", 15, 10);


        /** Pièce 1 - L'Entrée maudite */
        Action coffre1 = new Action2_OuvrirTresor( gain1);
        Action combat1 = new Action3_Combattre(ennemi1);
        Action sante1 = new Action1_AugmenterSanter(20);
        Action achatArme3 = new Action4_AcheterArme(arme3);
        Action combat2 = new Action3_Combattre(ennemi2);
        Action achatArme4 = new Action4_AcheterArme(arme4);
        Action rien1 = new Action5_Rien("Rien");

        piece1.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece1.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece1.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece1.ajouterChoix(new Choix("Rien", rien1));

        /** Pièce 2 - Le Jardin des statutes */
        Action sante2 = new Action1_AugmenterSanter( 30);
        Action achatArme5 = new Action4_AcheterArme(arme5);
        Action rien2 = new Action5_Rien("Rien");
        Action sante3 = new Action1_AugmenterSanter( 50);
        Action achatArme6 = new Action4_AcheterArme(arme6);
        Action combat3 = new Action3_Combattre(ennemi3);
        Action coffre2 = new Action2_OuvrirTresor( gain2);

        piece2.ajouterChoix(new Choix("Vie + Achat armes", sante2, achatArme5));
        piece2.ajouterChoix(new Choix("Rien", rien2));
        piece2.ajouterChoix(new Choix("Vie + Achat armes", sante3, achatArme6));
        piece2.ajouterChoix(new Choix("Combat + Trésor", combat3, coffre2));


        /** Piece 3 - La Chambre des ombres chuchotantes  */
        Action sante4 = new Action1_AugmenterSanter( 60);
        Action coffre3 = new Action2_OuvrirTresor( gain3);
        Action combat4 = new Action3_Combattre(ennemi4);
        Action rien3 = new Action5_Rien("Rien");
        Action achatArme7 = new Action4_AcheterArme(arme7);

        piece3.ajouterChoix(new Choix("Vie + Trésor", sante4,coffre3));
        piece3.ajouterChoix(new Choix("Combat", combat4));
        piece3.ajouterChoix(new Choix("Rien", rien3));
        piece3.ajouterChoix(new Choix("Achat arme" + achatArme7));


        /** Piece 4 - Le Sanctuaire oublié */
        Action achatArme8 = new Action4_AcheterArme(arme8);
        Action coffre4 = new Action2_OuvrirTresor(gain4);
        Action combat5 = new Action3_Combattre(ennemi5);
        Action combat6 = new Action3_Combattre(ennemi6);
        Action sante5 = new Action1_AugmenterSanter( 60);
        Action rien4 = new Action5_Rien("Rien");

        piece4.ajouterChoix(new Choix("Achat arme + coffre", achatArme8, coffre4));
        piece4.ajouterChoix(new Choix("Combat + Combat", combat5, combat6));
        piece4.ajouterChoix(new Choix("Vie",sante5));
        piece4.ajouterChoix(new Choix("Rien", rien4));


        /**  Piece 5 - La Gallerie des Illusions */
        Action rien5 = new Action5_Rien("Rien");
        Action achatArme9 = new Action4_AcheterArme(arme9);
        Action sante6 = new Action1_AugmenterSanter( 60);
        Action combat7 = new Action3_Combattre(ennemi7);
        Action coffre5 = new Action2_OuvrirTresor(gain5);
        Action achatArme10 = new Action4_AcheterArme(arme10);
        Action sante7 = new Action1_AugmenterSanter( 60);

        piece5.ajouterChoix(new Choix("Rien", rien5));
        piece5.ajouterChoix(new Choix("Achat arme + Vie",achatArme9, sante6));
        piece5.ajouterChoix(new Choix("Combat + Coffre",combat7, coffre5 ));
        piece5.ajouterChoix(new Choix("Achat arme + Vie", achatArme10, sante7));


        /** Piece 6 - La Salle du Trône du Gardien */
        Action achatArme11 = new Action4_AcheterArme(arme11);
        Action sante8 = new Action1_AugmenterSanter( 60);
        Action rien6 = new Action5_Rien("Rien");
        Action combat8 = new Action3_Combattre(ennemi8);
        Action combatBoss = new Action3_Combattre(boss);

        piece6.ajouterChoix(new Choix("Achat arme + Boss",achatArme11, combatBoss));
        piece6.ajouterChoix(new Choix("Vie + Boss", sante8, combatBoss ));
        piece6.ajouterChoix(new Choix("Rien + Boss",rien6, combatBoss));
        piece6.ajouterChoix(new Choix("Combat + Boss",combat8, combatBoss));


        /** Ajout des pièces à la liste */
        pieces.addAll(Arrays.asList(piece1, piece2, piece3, piece4, piece5, piece6));


        /**  Connexions entre les pièces */
        piece1.ajouterConnexion(piece2);// Droite
        piece1.ajouterConnexion(piece3); //Gauche
        piece2.ajouterConnexion(piece4);//Tout droit
        piece2.ajouterConnexion(piece1);//En arrière
        piece3.ajouterConnexion(piece5);//Tout droit
        piece3.ajouterConnexion(piece1);//En arrière
        piece4.ajouterConnexion(piece2); //En arrière
        piece5.ajouterConnexion(piece6); //Tout droit
        piece5.ajouterConnexion(piece1); //En arrière
        piece6.ajouterConnexion(piece5); //En arrière
    }


    public Ennemi getBoss(){
        return boss;
    }

    public Piece getPiece(int numeroPiece) {
        for (Piece piece : pieces) {
            if (piece.getNumeroPiece() == numeroPiece) {
                return piece;
            }
        }
        return null;
    }

    public void deplacementJoueur(Personnage joueur){
        Scanner scanner = new Scanner(System.in);
        Piece pieceActuelle = joueur.getPositionActuelle();
        Piece pieceDestination = null;
        while (true) {
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println(" \uD83D\uDEAA \uD83C\uDFC3 Dans quelle direction voulez-vous aller ? (droite/gauche/devant/arrière)");
            System.out.println("------------------------------------------------------------------------------------------------");
            String direction = scanner.nextLine().trim().toLowerCase();
            switch (direction) {
                case "droite":
                    // Déplacement vers la droite
                    if (pieceActuelle.getNumeroPiece() == 1) {
                        pieceDestination = getPiece(2);
                    }
                    break;
                case "gauche":
                    // Déplacement vers la gauche
                    if (pieceActuelle.getNumeroPiece() == 1) {
                        pieceDestination = getPiece(3);
                    }
                    break;
                case "devant":
                    // Déplacement tout droit
                    if(pieceActuelle.getNumeroPiece() == 2) {
                        pieceDestination = getPiece(4);
                    } else if(pieceActuelle.getNumeroPiece() == 3) {
                        pieceDestination = getPiece(5);
                    }
                    else if(pieceActuelle.getNumeroPiece()== 5){
                        pieceDestination = getPiece(6);
                    }
                    break;
                case "arrière":
                    // Déplacement en arrière
                    if(pieceActuelle.getNumeroPiece() == 2 || pieceActuelle.getNumeroPiece() == 3) {
                        pieceDestination = getPiece(1);
                    } else if(pieceActuelle.getNumeroPiece() == 4) {
                        pieceDestination = getPiece(2);
                    } else if(pieceActuelle.getNumeroPiece() == 5) {
                        pieceDestination = getPiece(1);
                    } else if(pieceActuelle.getNumeroPiece() == 6) {
                        pieceDestination = getPiece(5);
                    }
                    break;
                default:
                    System.out.println("\nDirection inconnue. Veuillez réessayer.");
                    continue;
            }

            // Déplacement si la destination est valide
            if (pieceDestination != null && pieceActuelle.estConnecteeAvec(pieceDestination)) {
                joueur.setPositionActuelle(pieceDestination);
                break;
            }
            else {
                System.out.println("\nDéplacement impossible dans cette direction. ❌ ");
            }
        }
    }
}
