public class Personnage {

    /** Variables d'instances */
    private String nom;
    private int barreDeVie;
    private Arme arme;
    private int pieces;
    public static final int SANTE_MAXIMALE = 100;
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


    /** Afficher le profil du joueur*/
    public void afficherEtat() {
        String barreDeVie = String.format("❤️ Santé: %d%%", getBarreDeVie());
        String infoArme = String.format("⚔️ Arme: %s", getArme().getNom());
        String degatsArme = String.format("💥 Dégâts: %d", getArme().getDegats());
        String sacoche = String.format("💰 Sacoche: %d pièces", getPorteMonnaie());
        System.out.println("                                                         ╔══════════════════════════════════════════════════════════════╗");
        System.out.println("                                                         ║                     ~ État de l'Aventurier ~                 ║");
        System.out.println("                                                         ╠══════════════════════════════════════════════════════════════╣");
        System.out.printf("                                                         ║ %-60s ║\n", barreDeVie);
        System.out.printf("                                                         ║ %-60s ║\n", infoArme);
        System.out.printf("                                                         ║ %-60s ║\n", degatsArme);
        System.out.printf("                                                         ║ %-60s ║\n", sacoche);
        System.out.println("                                                         ╚══════════════════════════════════════════════════════════════╝\n");
    }

    /** Déplacement du joueur dans le labyrinthe */
    public void seDeplacer(Labyrinthe labyrinthe){
        labyrinthe.deplacementJoueur(this);
    }


    /** Vérification du joueur Gagnant/Perdant*/
    public boolean verifierEtatDuJeu(Personnage joueur, Piece pieceActuelle, Labyrinthe labyrinthe ){
        if (joueur.getBarreDeVie() <= 0){
            System.out.println("Vous avez perdu ! Votre aventure se termine ici...");
            return false; //Le jeu doit se terminer -> Perdu
        }
        else if (pieceActuelle.isEstPieceDuBoss() && labyrinthe.getBoss().getEnnemiVie() <= 0){
            System.out.println("Félicitations ! Vous avez vaincu le " + labyrinthe.getBoss().getNom() + " et réussi votre aventure !");
            return false; //Le jeu doit se terminer -> Gagné
        }
        else {
            return true; //Le jeu continue -> En cours de partie
        }
    }
}


