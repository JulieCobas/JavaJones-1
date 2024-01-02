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
        // Initialisation des pièces
        Piece piece1 = new Piece("L'Entrée maudite", 1, false);
        Piece piece2 = new Piece("La Chambre des ombres chuchotantes", 2, false);
        Piece piece3 = new Piece("Le Jardin des statutes", 3, false);
        Piece piece4 = new Piece("Le Sanctuaire oublié", 4, false);
        Piece piece5 = new Piece("La Gallerie des Illusions", 5, false);
        Piece piece6 = new Piece("La Salle du Trône du Gardien", 6, true);

        //Création des coffres
        Coffre coffre1 = new Coffre("Coffre de pièces en argent", 5);
        Coffre coffre2 = new Coffre("Coffre d'Emeraudes", 20);
        Coffre coffre3 = new Coffre("Coffre de Saphirs", 20);
        Coffre coffre4 = new Coffre("Coffre d'Or Pur", 40);
        Coffre coffre5 = new Coffre("Coffre de diamants et de rubis", 100);

        //Création d'ennemis
        Ennemi ennemi1 = new Ennemi("Combats de serpents", 5, 5);
        Ennemi ennemi2 = new Ennemi("Combat de fantômes ", 10, 10);
        Ennemi ennemi3 = new Ennemi("Pièges au mur", 0, 20);
        Ennemi ennemi4 = new Ennemi("Chauves-souris hurlantes", 10, 20);
        Ennemi ennemi5 = new Ennemi("Tomber dans une cave", 0, 25);
        Ennemi ennemi6 = new Ennemi("Combat de nains agressifs", 25, 30);
        Ennemi ennemi7 = new Ennemi("Combat d'hommes en feu", 20, 25);
        Ennemi ennemi8 = new Ennemi("Araignées géantes", 30, 45);
        Ennemi boss = new Ennemi("Gardien du crâne d'or", 100, 100);

        //Création des armes
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

        //Création des actions Santé
        Action sante1 = new Action1_AugmenterSanter("Vous avez trouver de la vie !",20);
        Action sante2 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 30);
        Action sante3 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 50);
        Action sante4 = new Action1_AugmenterSanter("Vous avez trouver de la vie !", 60);

        //Création des actions qui ne découlent sur rien
        Action rien1 = new Action5_Rien("Rien");
        Action rien2 = new Action5_Rien("Rien");
        Action rien3 = new Action5_Rien("Rien");
        Action rien4 = new Action5_Rien("Rien");
        Action rien5 = new Action5_Rien("Rien");
        Action rien6 = new Action5_Rien("Rien");

        //Création et ajout des choix aux différentes pièces
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
