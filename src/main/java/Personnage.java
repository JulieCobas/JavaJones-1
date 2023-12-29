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
    public int getBarreDeVie() {
        return barreDeVie;
    }
    public Arme getArme() {
        return arme;
    }
    public int getPorteMonnaie() {
        return pieces;
    }
    public Piece getPositionActuelle() {
        return positionActuelle;
    }

    /** SETTER */
    public void setBarreDeVie(int barreDeVie) {
        this.barreDeVie = barreDeVie;
    }
    public void setArme(Arme arme) {
        this.arme = arme;
    }
    public void setPorteMonnaie(int pieces) {
        this.pieces = pieces;
    }

}


