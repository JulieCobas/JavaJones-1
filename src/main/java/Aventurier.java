import java.util.Scanner;

public class Aventurier extends Personnage {

    /** Variables d'instances */
    private Arme arme;
    private int pieces;
    public static final int SANTE_MAXIMALE = 100;
    private Piece positionActuelle;
    private Scanner scanner;

    /** CONSTRUCTEUR */
    public Aventurier(String nom){
        super(nom,SANTE_MAXIMALE);
        this.pieces = 0;
    }

    /** GETTER */
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
    @Override
    public void setVie(int nouvelleVie) {
        if (nouvelleVie > SANTE_MAXIMALE) {
             vie = SANTE_MAXIMALE;
        } else if (nouvelleVie <= 0) {
             vie = 0;
            System.out.println(nom + " est mort !");
        } else {
            vie = nouvelleVie;
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
        String barreDeVie = String.format("❤️ Santé: %d%%", getVie());
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
    public boolean verifierEtatDuJeu(Aventurier joueur, Piece pieceActuelle, Labyrinthe labyrinthe ){
        if (getVie() <= 0){
            System.out.println("Vous avez perdu ! Votre aventure se termine ici...");
            return false; //Le jeu doit se terminer -> Perdu
        }
        else if (pieceActuelle.isEstPieceDuBoss() && labyrinthe.getBoss().getVie() <= 0){
            System.out.println("Félicitations ! Vous avez vaincu le " + labyrinthe.getBoss().getNom() + " et réussi votre aventure !");
            return false; //Le jeu doit se terminer -> Gagné
        }
        else {
            return true; //Le jeu continue -> En cours de partie
        }
    }

    /** Récupérer le choix de l'utilisateur et nettoie la saisie (sans espaces + convertir en minuscule */
    public String obtenirChoixUtilisateur(){
        return scanner.nextLine().trim().toLowerCase();
    }


    /** Attaquer un ennemi*/

}


