public class Personnage {

    /** Variables d'instance */
    private String nom;
    private int barreDeVie;
    private Arme arme;
    private int pieces;
    private static final int SANTE_MAXIMALE = 100;
    private Piece positionActuelle;

    /** CONSTRUCTEUR */
    public Personnage(String nom){
        this.nom = nom;
        this.barreDeVie = SANTE_MAXIMALE;
        this.pieces = 0;
    }

    /** GETTER */
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
        if (barreDeVie > SANTE_MAXIMALE) {
            this.barreDeVie = SANTE_MAXIMALE;
        } else if (barreDeVie <= 0) {
            this.barreDeVie = 0;
            System.out.println(nom + " est mort !");
        } else {
            this.barreDeVie = barreDeVie;
        }
    }
    public void setArme(Arme arme) {
        this.arme = arme;
    }
    public void setPorteMonnaie(int pieces) {
        this.pieces = pieces;
    }
    public void setPositionActuelle(Piece positionActuelle) {
        this.positionActuelle = positionActuelle;
    }

    public void afficherEtat() {
        String barreDeVie = String.format("SANTE: %d", getBarreDeVie());
        String infoArme = String.format("ARME: %s", getArme().getNom());
        String degatsArme = String.format("DEGATS: %d", getArme().getDegats());

        String etat = String.join(" | ", "\uD83E\uDD20", barreDeVie, infoArme, degatsArme);
        System.out.println("\n+--------------------------------------+");
        System.out.println("| " + etat);
        System.out.println("+--------------------------------------+\n");
    }

    public void seDeplacer(int numeroPiece, Labyrinthe labyrinthe) {
        Piece pieceDestination = labyrinthe.getPiece(numeroPiece);
        if (pieceDestination != null && this.positionActuelle.estConnecteeAvec(pieceDestination)) {
            this.positionActuelle = pieceDestination;
            System.out.println("Vous êtes maintenant dans : " + pieceDestination.getNomPiece());
            pieceDestination.afficherDescriptionPiece();
        } else {
            System.out.println("Déplacement impossible vers la pièce " + numeroPiece);
        }
    }

}


