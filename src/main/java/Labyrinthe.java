import java.util.*;

public class Labyrinthe {

    /** VARIABLES D'INSTANCES */
    private final List<Piece> pieces;
    public static Arme arme1 = new Arme("Lasso", "",5, 0);
    public static Arme arme2 = new Arme("Couteau a Beurre", "",6, 0);
    private Ennemi boss;

    /** CONSTRUCTEUR */
    public Labyrinthe() {
        pieces = new ArrayList<>();
        initialisation();
    }

    private void initialisation() { //Création du labyrinthe

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
                2, false);

        Piece piece3 = new Piece("💀💀        LA CHAMBRE DES OMBRES CHUCHOTANTES       👻👻",
                " Vous entrez dans une chambre où les murs sont couverts de fresques anciennes, " +
                        "dépeignant des scènes énigmatiques et des figures fantomatiques. Un murmure constant," +
                        "presque imperceptible, imprègne l'air, comme si les ombres elles-mêmes partageaient des " +
                        "secrets anciens. Des bougies éparses, dont la flamme vacille, projettent des ombres mouvantes " +
                        "qui semblent chuchoter entre elles. Le sol est jonché de fragments de pierres anciennes, et " +
                        "l'atmosphère est lourde d'un mystère palpable.",
                3, false);

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
        Coffre gain2 = new Coffre("Coffre d'Emeraudes", 15);
        Coffre gain3 = new Coffre("Coffre de Saphirs", 40);
        Coffre gain4 = new Coffre("Coffre d'Or Pur", 60);
        Coffre gain5 = new Coffre("Coffre de diamants et de rubis", 100);


        /** Création d'ennemis */
        Ennemi ennemi1 = new Ennemi("des serpents 🐍", 5, 5);
        Ennemi ennemi2 = new Ennemi("des chauves-souris hurlantes 🦇🦇", 10, 10);
        Ennemi ennemi3 = new Ennemi("des gargouilles de pierre 🗿 ", 15, 15);
        Ennemi ennemi4 = new Ennemi("des spectres glaciales 👻",20, 20);
        Ennemi ennemi5 = new Ennemi("des morts vivants 💀💀", 25, 25); // A MODIFIER
        Ennemi ennemi6 = new Ennemi("des plantes carnivores 🥀", 30, 30);
        Ennemi ennemi7 = new Ennemi("des hommes en feu 🔥", 35, 35);
        Ennemi ennemi8 = new Ennemi("une araignée géante 🕷️🕸️", 40, 40);
        boss = new Ennemi("le Gardien du Crâne de Cristal 🤴", 500, 10);


        /** Création des armes */
        Arme arme3 = new Arme("Parapluie de combat","Un parapluie ordinaire en apparence, mais qui peut se transformer en bouclier ou en épée.", 10, 5);
        Arme arme4 = new Arme("Baguette Magique", "Une simple baguette de bois qui peut lancer des sorts surprenants, comme transformer les ennemis en grenouilles.", 15, 10);
        Arme arme5 = new Arme("Chausson de Fer","Un chausson confortable à l'extérieur, mais incroyablement solide et lourd, parfait pour balancer sur vos adversaires.", 20, 15);
        Arme arme6 = new Arme("Gant de Cuisine","Un gant qui protège de la chaleur et confère une force surhumaine pour des claques monumentales.", 25, 20);
        Arme arme7 = new Arme("Livre Lourd","Un gros livre, parfait pour jeter ou pour frapper avec savoir.", 30, 25);
        Arme arme8 = new Arme("Sac à Main de Dame", "Ne sous-estimez jamais ce qui peut en sortir ou de son efficacité en toutes situations.",40, 30);
        Arme arme9 = new Arme("Baguette de Pain Durcie","Une baguette de pain si vieille et dure qu'elle peut servir de massue.", 50, 50);
        Arme arme10 = new Arme("Toaster Projectile","Un toaster qui lance des tranches de pain grillé à haute vitesse, idéal pour des attaques surprenantes au petit-déjeuner", 60, 60);
        Arme arme11 = new Arme("Lance-Roquette Feux d'Artifice Express","Transformez n'importe quel problème en une étincelle colorée. Parfait pour les occassions spéciales...", 100, 80);


        /** Pièce 1 - L'Entrée maudite */
        Action coffre1 = new Action2_OuvrirTresor(gain1);
        Action combat1 = new Action3_Combattre(ennemi1);
        Action sante1 = new Action1_AugmenterSanter(20);
        Action achatArme3 = new Action4_AcheterArme(arme3);
        Action combat2 = new Action3_Combattre(ennemi2);
        Action achatArme4 = new Action4_AcheterArme(arme4);
        Action rien1 = new Action5_Rien("Rien");

        piece1.ajouterChoix(new Choix("Dessiner les ombres pour révéler une porte cachée.", combat1, coffre1));
        piece1.ajouterChoix(new Choix("Écouter le rythme des gouttes d'eau pour trouver un levier secret.", sante1, achatArme3));
        piece1.ajouterChoix(new Choix("Assembler un puzzle de fossiles révélant un code.", combat2, achatArme4));
        piece1.ajouterChoix(new Choix("Utiliser la torche pour découvrir une inscription cachée.", rien1));

        /** Pièce 2 - Le Jardin des statutes */
        Action sante2 = new Action1_AugmenterSanter( 30);
        Action achatArme5 = new Action4_AcheterArme(arme5);
        Action rien2 = new Action5_Rien("Rien");
        Action sante3 = new Action1_AugmenterSanter( 50);
        Action achatArme6 = new Action4_AcheterArme(arme6);
        Action combat3 = new Action3_Combattre(ennemi3);
        Action coffre2 = new Action2_OuvrirTresor( gain2);

        piece2.ajouterChoix(new Choix("Projeter la lumière lunaire sur les statues pour dévoiler un chemin.", sante2, achatArme5));
        piece2.ajouterChoix(new Choix("Réarranger des fleurs pour ouvrir une grotte secrète.", rien2));
        piece2.ajouterChoix(new Choix("Raconter un conte devant une statue pour révéler quelque chose...", sante3, achatArme6));
        piece2.ajouterChoix(new Choix("Faire pivoter une statue pour les aligner aux autres.", combat3, coffre2));


        /** Piece 3 - La Chambre des ombres chuchotantes  */
        Action sante4 = new Action1_AugmenterSanter( 60);
        Action coffre3 = new Action2_OuvrirTresor( gain3);
        Action combat4 = new Action3_Combattre(ennemi4);
        Action rien3 = new Action5_Rien("Rien");
        Action achatArme7 = new Action4_AcheterArme(arme7);

        piece3.ajouterChoix(new Choix("Suivre les murmures jusqu'à une fresque spécifique qui cache un bouton secret.", sante4,coffre3));
        piece3.ajouterChoix(new Choix("Utiliser le flamboiement des bougies pour révéler des symboles cachés sur les murs.", combat4));
        piece3.ajouterChoix(new Choix("Chercher sous le tapis pour dévoiler une trappe.", rien3));
        piece3.ajouterChoix(new Choix("Ouvrir la bibliothèque menant vers une salle cachée.", achatArme7));


        /** Piece 4 - Le Sanctuaire oublié */
        Action achatArme8 = new Action4_AcheterArme(arme8);
        Action coffre4 = new Action2_OuvrirTresor(gain4);
        Action combat5 = new Action3_Combattre(ennemi5);
        Action combat6 = new Action3_Combattre(ennemi6);
        Action sante5 = new Action1_AugmenterSanter( 60);
        Action rien4 = new Action5_Rien("Rien");

        piece4.ajouterChoix(new Choix("Déplacer l'autel et révéler une cavité.", coffre4, achatArme8));
        piece4.ajouterChoix(new Choix("Projeter un plan caché avec les gemmes de l'autel.", combat5, combat6));
        piece4.ajouterChoix(new Choix("Réciter un ancien serment devant les sarcophages",sante5));
        piece4.ajouterChoix(new Choix("Souffler doucement sur la poussière accumulée sur l'autel", rien4));


        /**  Piece 5 - La Gallerie des Illusions */
        Action rien5 = new Action5_Rien("Rien");
        Action achatArme9 = new Action4_AcheterArme(arme9);
        Action sante6 = new Action1_AugmenterSanter( 60);
        Action combat7 = new Action3_Combattre(ennemi7);
        Action coffre5 = new Action2_OuvrirTresor(gain5);
        Action achatArme10 = new Action4_AcheterArme(arme10);
        Action sante7 = new Action1_AugmenterSanter( 60);

        piece5.ajouterChoix(new Choix("Marcher en suivant un reflet qui change de place pour découvrir une dalle secrète.", rien5));
        piece5.ajouterChoix(new Choix("Ajuster l'angle des miroirs pour révéler un code sur le mur.",achatArme9, sante6));
        piece5.ajouterChoix(new Choix("Reproduire une séquence de couleurs observée dans les miroirs pour débloquer une porte.",combat7, coffre5));
        piece5.ajouterChoix(new Choix("Trouver un miroir qui montre le passé de la galerie, révélant un indice caché.", achatArme10, sante7));


        /** Piece 6 - La Salle du Trône du Gardien */
        Action achatArme11 = new Action4_AcheterArme(arme11);
        Action sante8 = new Action1_AugmenterSanter( 60);
        Action rien6 = new Action5_Rien("Rien");
        Action combat8 = new Action3_Combattre(ennemi8);
        Action combatBoss = new Action3_Combattre(boss);

        piece6.ajouterChoix(new Choix("Utiliser la lumière des fenêtres pour lire des inscriptions au sol.",achatArme11, combatBoss));
        piece6.ajouterChoix(new Choix("Trouver un mécanisme derrière le trône révélant un passage.", sante8, combatBoss ));
        piece6.ajouterChoix(new Choix("Réciter le nom du gardien en face du trône pour ouvrir une cachette secrète.",rien6, combatBoss));
        piece6.ajouterChoix(new Choix("Examiner les joyaux du trône pour activer un mécanisme sous le siège.",combat8, combatBoss));

        /** Ajout des pièces à la liste */
        pieces.addAll(Arrays.asList(piece1, piece2, piece3, piece4, piece5, piece6));
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

    public void deplacementJoueur(Aventurier joueur){
        Scanner scanner = new Scanner(System.in);
        Piece pieceActuelle = joueur.getPositionActuelle();
        Piece pieceDestination = null;
        while (true) {
            System.out.println(">------------------------------------------------------------------------------------------------>");
            System.out.println(" \uD83D\uDEAA \uD83C\uDFC3 Dans quelle direction voulez-vous aller ? (droite/gauche/devant/arrière)");
            System.out.println(">------------------------------------------------------------------------------------------------>");

            String direction = scanner.nextLine().trim().toLowerCase();
            switch (direction) {
                case "droite":
                    // Déplacement vers la droite
                    if( pieceActuelle.getNumeroPiece() == 1) {
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
                    }
                    if(pieceActuelle.getNumeroPiece() == 3) {
                        pieceDestination = getPiece(5);
                    }
                    if(pieceActuelle.getNumeroPiece()== 5){
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

            // Déplacement si la destination n'est pas nulle
            if (pieceDestination != null) {
                joueur.setPositionActuelle(pieceDestination);
                break;
            }
            //Cul de sac de la pièce 4
            if (pieceActuelle.getNumeroPiece() == 4){
                System.out.println("\nVous êtes bloquée. On ne peut pas aller plus loin. Retourner en arrière...");
                }
            //Si la direction est impossible
            else {System.out.println("\nDéplacement impossible dans cette direction. ❌ ");
            }
        }
    }
}
