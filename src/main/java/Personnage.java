public class Personnage {

    /** Variables d'instance */
    private String nom;
    private int barreDeVie;
    private Arme arme;
    private int pieces;

    /** Constructeur*/
    public Personnage(String nom){
        this.nom=nom;
        this.barreDeVie = 100;
        this.pieces = 0;
    }

    public void acheterArme(Arme nouvelleArme){
        if (pieces >= nouvelleArme.getCout()){
            this.arme = nouvelleArme;
            this.pieces = nouvelleArme.getCout();
            System.out.println("Arme achetée : " + nouvelleArme.getNom());
        }
        else{
            System.out.println("Pas assez de pièces pour acheter cette arme.");
        }
    }

}
