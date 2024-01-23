import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Action1_AugmenterSanterTest {

    private Aventurier testeur; //Création du personnage testeur avec vie initiale à 100
    private Arme arme1; //Création d'une arme de départ que possède le joueur

    private Piece piece1; //Création d'une pièce
    private Choix choix1 ; //Création du choix possible dans la pièce (seulement 1 crée au lieu de 4 dans le jeu)

    private Action1_AugmenterSanter sante1; //Variable de création de la santé
    private Action5_Rien rien1; //Variable rien obtenir ni faire


    @BeforeEach
    void setUp() {
        //Création de l'aventurier, arme de départ et santé initiale 100
        testeur = new Aventurier("testeur"); //Création de l'aventurier test avec d'office santé maximale à 100
        arme1 = new Arme("Lasso", "",5, 0); //Création d'une arme de départ
        testeur.setArme(arme1); //Modification de l'arme de départ

    }

    //Test = Santé maximum atteint
    @Test
    void controleSante() {

        //Given
        piece1 = new Piece("L'ENTRÉE MAUDITE ️","description pièce",1, false);
        sante1 = new Action1_AugmenterSanter(20); //-> Ce qui va être tester
        rien1 = new Action5_Rien("Rien obtenu");
        choix1 = new Choix("description choix", sante1, rien1);
        System.out.println("Point de vie initiale : " + testeur.getVie());
        testeur.setVie(20);

        //When
        choix1.getActions();
        for (Action action : choix1.getActions()){
            action.exectuer(testeur);
        }

        // Then
        System.out.println("Point de vie après gain: " + testeur.getVie());
        assertEquals(testeur.getVie(),40);

    }

    @Test
    void maximumSanteAtteint() {

        // Given
        piece1 = new Piece("L'ENTRÉE MAUDITE ️","description pièce",1, false);
        sante1 = new Action1_AugmenterSanter(20); //-> Ce qui va être tester
        rien1 = new Action5_Rien("Rien obtenu");
        choix1 = new Choix("description choix", sante1, rien1);
        System.out.println("Point de vie initiale : " + testeur.getVie());

        // When
        choix1.getActions();
        for (Action action : choix1.getActions()){
            action.exectuer(testeur);
        }

        // Then
        System.out.println("Point de vie après gain: " + testeur.getVie());
        assertEquals(testeur.getVie(),100); //normalement avoir 120 mais max 100

    }
}
