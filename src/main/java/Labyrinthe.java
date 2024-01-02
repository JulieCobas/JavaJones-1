import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Labyrinthe {

    /** VARIABLES D'INSTANCES */
    private List<Piece> pieces;

    /** CONSTRUCTEUR */
    public Labyrinthe() {
        pieces = new ArrayList<>();
        initialisation();
    }

    private void initialisation() {

        /** Initialisation des pièces */
        Piece piece1 = new Piece("L'Entrée maudite", 1, false);
        Piece piece2 = new Piece("La Chambre des ombres chuchotantes", 2, false);
        Piece piece3 = new Piece("Le Jardin des statutes", 3, false);
        Piece piece4 = new Piece("Le Sanctuaire oublié", 4, false);
        Piece piece5 = new Piece("La Gallerie des Illusions", 5, false);
        Piece piece6 = new Piece("La Salle du Trône du Gardien", 6, true);


        /** Création des coffres */
        Coffre gain1 = new Coffre("Coffre de pièces en argent", 5);
        Coffre gain2 = new Coffre("Coffre d'Emeraudes", 20);
        Coffre gain3 = new Coffre("Coffre de Saphirs", 20);
        Coffre gain4 = new Coffre("Coffre d'Or Pur", 40);
        Coffre gain5 = new Coffre("Coffre de diamants et de rubis", 100);


        /** Création d'ennemis */
        Ennemi ennemi1 = new Ennemi("Combats de serpents", 5, 5);
        Ennemi ennemi2 = new Ennemi("Combat de fantômes ", 10, 10);
        Ennemi ennemi3 = new Ennemi("Pièges au mur", 0, 20);
        Ennemi ennemi4 = new Ennemi("Chauves-souris hurlantes", 10, 20);
        Ennemi ennemi5 = new Ennemi("Tomber dans une cave", 0, 25);
        Ennemi ennemi6 = new Ennemi("Combat de nains agressifs", 25, 30);
        Ennemi ennemi7 = new Ennemi("Combat d'hommes en feu", 20, 25);
        Ennemi ennemi8 = new Ennemi("Araignées géantes", 30, 45);
        Ennemi boss = new Ennemi("Gardien du crâne d'or", 100, 100);


        /** Création des armes */
        Arme arme1 = new Arme("Lasso", 5, 0);
        Arme arme2 = new Arme("Couteau a Beurre", 6, 0);
        Arme arme3 = new Arme("Parapluie", 8, 3);
        Arme arme4 = new Arme("Baguette Magique", 10, 5);
        Arme arme5 = new Arme("Arme5", 15, 10);
        Arme arme6 = new Arme("Arme5", 15, 10);
        Arme arme7 = new Arme("Arme5", 15, 10);
        Arme arme8 = new Arme("Arme5", 15, 10);
        Arme arme9 = new Arme("Arme5", 15, 10);
        Arme arme10 = new Arme("Arme5", 15, 10);
        Arme arme11 = new Arme("Arme5", 15, 10);


        /** Création des actions et des choix par pièces */
        // Pièce 1 - L'Entrée maudite
        Action coffre1 = new Action2_OuvrirTresor("Description histoire coffre", gain1);
        Action combat1 = new Action3_Combattre("Description combat ennemi1",ennemi1);
        Action sante1 = new Action1_AugmenterSanter("Vous avez trouver de la vie !",20);
        Action achatArme3 = new Action4_AcheterArme("Description achatarme3",arme3);
        Action combat2 = new Action3_Combattre("Description ennemi2",ennemi2);
        Action achatArme4 = new Action4_AcheterArme("Description achat4",arme4);
        Action rien1 = new Action5_Rien("Rien");

        piece1.ajouterChoix(new Choix("Gagner un trésor et combat", coffre1, combat1));
        piece1.ajouterChoix(new Choix("Vie + achat arme", sante1, achatArme3));
        piece1.ajouterChoix(new Choix("Combat + Achat arme", combat2, achatArme4));
        piece1.ajouterChoix(new Choix("Rien", rien1));


        //Pièce 2 - La Chambre des ombres chuchotantes
        Action sante2 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 30);
        Action achatArme5 = new Action4_AcheterArme("Description achat5",arme5);
        Action rien2 = new Action5_Rien("Rien");
        Action sante3 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 50);
        Action achatArme6 = new Action4_AcheterArme("Description achat5",arme6);
        Action combat3 = new Action3_Combattre("Description ennemi3",ennemi3);
        Action coffre2 = new Action2_OuvrirTresor("Description histoire coffre", gain2);

        piece2.ajouterChoix(new Choix("Vie + Achat armes", sante2, achatArme5));
        piece2.ajouterChoix(new Choix("Rien", rien2));
        piece2.ajouterChoix(new Choix("Vie + Achat armes", sante3, achatArme6));
        piece2.ajouterChoix(new Choix("Combat + Trésor", combat3, coffre2));


        //Piece 3 - Le Jardin des statutes
        Action sante4 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 60);
        Action coffre3 = new Action2_OuvrirTresor("Description histoire coffre", gain3);
        Action combat4 = new Action3_Combattre("Description ennemi4",ennemi4);
        Action rien3 = new Action5_Rien("Rien");
        Action achatArme7 = new Action4_AcheterArme("Description achat7",arme7);

        piece3.ajouterChoix(new Choix("Vie + Trésor", sante4,coffre3));
        piece3.ajouterChoix(new Choix("Combat", combat4));
        piece3.ajouterChoix(new Choix("Rien", rien3));
        piece3.ajouterChoix(new Choix("Achat arme" + achatArme7));


        //Piece 4 - Le Sanctuaire oublié
        Action achatArme8 = new Action4_AcheterArme("Description achat8",arme8);
        Action coffre4 = new Action2_OuvrirTresor("Description histoire coffre", gain4);
        Action combat5 = new Action3_Combattre("Description ennemi4",ennemi5);
        Action combat6 = new Action3_Combattre("Description ennemi4",ennemi6);
        Action sante5 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 60);
        Action rien4 = new Action5_Rien("Rien");

        piece4.ajouterChoix(new Choix("Achat arme + coffre", achatArme8, coffre4));
        piece4.ajouterChoix(new Choix("Combat + Combat", combat5, combat6));
        piece4.ajouterChoix(new Choix("Vie",sante5));
        piece4.ajouterChoix(new Choix("Rien", rien4));


        //Piece 5 - La Gallerie des Illusions
        Action rien5 = new Action5_Rien("Rien");
        Action achatArme9 = new Action4_AcheterArme("Description achat8",arme9);
        Action sante6 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 60);
        Action combat7 = new Action3_Combattre("Description ennemi4",ennemi7);
        Action coffre5 = new Action2_OuvrirTresor("Description histoire coffre", gain5);
        Action achatArme10 = new Action4_AcheterArme("Description achat8",arme10);
        Action sante7 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 60);

        piece5.ajouterChoix(new Choix("Rien", rien5));
        piece5.ajouterChoix(new Choix("Achat arme + Vie",achatArme9, sante6));
        piece5.ajouterChoix(new Choix("Combat + Coffre",combat7, coffre5 ));
        piece5.ajouterChoix(new Choix("Achat arme + Vie", achatArme10, sante7));


        //Piece 6 - La Salle du Trône du Gardien
        Action achatArme11 = new Action4_AcheterArme("Description achat8",arme11);
        Action sante8 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 60);
        Action rien6 = new Action5_Rien("Rien");
        Action combat8 = new Action3_Combattre("Description ennemi4",ennemi8);
        Action combatBoss = new Action3_Combattre("Boss", boss);

        piece6.ajouterChoix(new Choix("Achat arme",achatArme11));
        piece6.ajouterChoix(new Choix("Vie", sante8 ));
        piece6.ajouterChoix(new Choix("Rien",rien6));
        piece6.ajouterChoix(new Choix("Combat",combat8));

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
