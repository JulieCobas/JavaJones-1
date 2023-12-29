import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Labyrinthe {

    /** VARIABLES D'INSTANCES */
    private List<Piece> pieces;

    /** CONSTRUCTEUR */
    public Labyrinthe() {
        pieces = new ArrayList<>();
        initialiserPieces();
    }

    private void initialiserPieces() {
        // Initialisation des pièces
        Piece piece1 = new Piece("L'Entrée maudite", 1, false);
        Piece piece2 = new Piece("La Chambre des ombres chuchotantes", 2, false);
        Piece piece3 = new Piece("Le Jardin des statutes", 3, false);
        Piece piece4 = new Piece("Le Sanctuaire oublié", 4, false);
        Piece piece5 = new Piece("La Gallerie des Illusions", 5, false);
        Piece piece6 = new Piece("La Salle du Trône du Gardien", 6, true);

        //Création des actions Santé
        Action sante1 = new Action1_AugmenterSanter("Vous avez trouver de la vie !",20);
        Action sante2 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 30);
        Action sante3 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 50);
        Action sante4 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 60);

        //Création des coffres
        Action coffre1 = new Action2_OuvrirTresor("Vous avez trouver un trésor !", 5);
        Action coffre2 = new Action2_OuvrirTresor("Vous avez trouver un trésor !", 10);
        Action coffre3 = new Action2_OuvrirTresor("Vous avez trouver un trésor !", 20);
        Action coffre4 = new Action2_OuvrirTresor("Vous avez trouver un trésor !", 50);
        Action coffre5 = new Action2_OuvrirTresor("Vous avez trouver un trésor !", 100);

        //Création des combats
        Action combat1 = new Action3_Combattre("Combats de serpents", 5);
        Action combat2 = new Action3_Combattre("Combat de fantômes", 10);
        Action combat3 = new Action3_Combattre("Pièges au mur", 15);
        Action combat4 = new Action3_Combattre("Chauves-souris", 20);
        Action combat5 = new Action3_Combattre("Tomber dans une cave", 25);
        Action combat6 = new Action3_Combattre("Combat de nains", 30);
        Action combat7 = new Action3_Combattre("Combat d'hommes de feu", 35);
        Action combat8 = new Action3_Combattre("Araignées géantes", 40);
        Action Boss = new Action3_Combattre("Combat du Boss", 45);

        //Création des armes et des achats possibles
        Action achatArme1 = new Action4_AcheterArme(new Arme("Lasso",5,0));
        Action achatArme2 = new Action4_AcheterArme(new Arme("Couteau a Beurre", 6, 0));
        Action achatArme3 = new Action4_AcheterArme(new Arme("Parapluie", 8, 3));
        Action achatArme4 = new Action4_AcheterArme(new Arme("Baguette Magique", 10, 5));
        Action achatArme5 = new Action4_AcheterArme(new Arme("Arme5", 15, 10));
        Action achatArme6 = new Action4_AcheterArme(new Arme("Arme6", 20, 20));
        Action achatArme7 = new Action4_AcheterArme(new Arme("Arme7", 25, 25));
        Action achatArme8 = new Action4_AcheterArme(new Arme("Arme8",40, 30));
        Action achatArme9 = new Action4_AcheterArme(new Arme("Arme9", 50, 40));
        Action achatArme10 = new Action4_AcheterArme(new Arme("Arme10", 80, 50));
        Action achatArme11 = new Action4_AcheterArme(new Arme("Arme11", 100, 85));

        //Création des actions qui ne découlent sur rien
        Action rien1 = new Action5_Rien("Rien");
        Action rien2 = new Action5_Rien("Rien");
        Action rien3 = new Action5_Rien("Rien");
        Action rien4 = new Action5_Rien("Rien");
        Action rien5 = new Action5_Rien("Rien");
        Action rien6 = new Action5_Rien("Rien");

        //Création et ajout des choix aux pièces
        piece1.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece1.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece1.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece1.ajouterChoix(new Choix("Rien", rien1));

        piece2.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece2.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece2.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece2.ajouterChoix(new Choix("Rien", rien1));

        piece3.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece3.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece3.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece3.ajouterChoix(new Choix("Rien", rien1));

        piece4.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece4.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece4.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece4.ajouterChoix(new Choix("Rien", rien1));

        piece5.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece5.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece5.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece5.ajouterChoix(new Choix("Rien", rien1));

        piece6.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece6.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece6.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece6.ajouterChoix(new Choix("Rien", rien1));


        // Ajout des pièces à la liste
        pieces.addAll(Arrays.asList(piece1, piece2, piece3, piece4, piece5, piece6));

        // Connexions entre les pièces
        piece1.ajouterConnexion(piece2);
        piece1.ajouterConnexion(piece3);
        piece2.ajouterConnexion(piece4);
        piece3.ajouterConnexion(piece5);
        piece5.ajouterConnexion(piece6);
    }

    public Piece getPiece(int numeroPiece) {
        for (Piece piece : pieces) {
            if (piece.getNumeroPiece() == numeroPiece) {
                return piece;
            }
        }
        return null;
    }
}
