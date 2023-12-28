public class Personnage {

    /** Variables d'instance */
    private String nom;
    private int barreDeVie;
    private Arme arme;
    private int pieces;
    private Piece positionActuelle;

    /** CONSTRUCTEUR */
    public Personnage(String nom){
        this.nom = nom;
        this.barreDeVie = 100;
        this.pieces = 0;
    }

    /** SETTER*/
    /** Obtenir le nom du joueur*/
    public String getNomJoueur() {
        return nom;
    }
    /** Obtenir l'état de la barre de vie'*/
    public int getBarreDeVie() {
        return barreDeVie;
    }

    /** Obtenir l'arme actuelle */
    public Arme getArme() {
        return arme;
    }

    /** Obtenir le montant du Porte-monnaie */
    public int getPorteMonnaie() {
        return pieces;
    }

    /** Obtenir la position actuelle dans la pièce où se situe le joueur */
    public Piece getPositionActuelle() {
        return positionActuelle;
    }

    /** SETTER */

     /** Modifier la santé du joueur */
    public void setBarreDeVie(int barreDeVie) {
        this.barreDeVie = barreDeVie;
    }

    /** Modifier l'arme actuelle du joueur*/
    public void setArme(Arme arme) {
        this.arme = arme;
    }

    /** Dépenser ou gagner de l'argent*/
    public void setPorteMonnaie(int pieces) {
        this.pieces = pieces;
    }

    /** Modifier la position actuelle dans la pièce où se situe le joueur*/
    public void seDeplacer(String direction) {
        if ("gauche".equals(direction) && positionActuelle.getPieceGauche() != null) {
            positionActuelle = positionActuelle.getPieceGauche();
        } else if ("droite".equals(direction) && positionActuelle.getPieceDroite() != null) {
            positionActuelle = positionActuelle.getPieceDroite();
        }
        // ... autres directions ...
        positionActuelle.entrer(this);
    }

    /** Acheter une arme */
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
