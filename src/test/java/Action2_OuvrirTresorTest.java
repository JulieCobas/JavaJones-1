import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/** Tester l'obtention de pièces dans la sacoche du personnage */
class Action2_OuvrirTresorTest {

    private Aventurier testeur; //Création du personnage testeur avec vie initiale à 100
    private Arme arme1; //Création d'une arme de départ que possède le joueur

    private Piece piece1; //Création d'une pièce
    private Choix choix1 ; //Création du choix possible dans la pièce (seulement 1 crée au lieu de 4 dans le jeu)

    private Action2_OuvrirTresor tresor1; //Variable création d'un gain de trésor
    private Coffre coffre1; //Variable création d'un coffre
    private Action5_Rien rien1; //Variable rien obtenir ni faire

    @BeforeEach
    void setUp() {
        //Création de l'aventurier, arme de départ et santé initiale 100
        testeur = new Aventurier("testeur"); //Création de l'aventurier test avec d'office santé maximale à 100
        arme1 = new Arme("Lasso", "",5, 0); //Création d'une arme de départ
        testeur.setArme(arme1); //Modification de l'arme de départ

    }

    @Test
    void GainPieces() {

        //Given
        piece1 = new Piece("L'ENTRÉE MAUDITE ️","description pièce",1, false); //Création d'une pièce
        coffre1 = new Coffre("Coffre de diamants", 30); //Création d'un coffre

        tresor1 = new Action2_OuvrirTresor(coffre1); //-> Ce qui va être tester

        rien1 = new Action5_Rien("Rien obtenu");
        choix1 = new Choix("description choix", tresor1, rien1);
        System.out.println("Nombre de pièces initiales : " + testeur.getPorteMonnaie());

        //When
        choix1.getActions();
        for (Action action : choix1.getActions()){
            action.exectuer(testeur);
        }

        // Then
        System.out.println("Nombre de pièces initiales : " + testeur.getPorteMonnaie());
        assertEquals(testeur.getPorteMonnaie(),30);
        testeur.afficherEtat();
    }
}