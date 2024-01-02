import java.util.ArrayList;
import java.util.List;

public class Piece {

    /** VARIABLES D'INSTANCE */
    private String description;
    private int numeroPiece;
    private List<Choix> choixList;
    private boolean estPieceDuBoss;
    private List<Piece> connexions; // Ajout pour gérer les connexions

    /** CONSTRUCTEUR */
    public Piece(String description, int numeroPiece, boolean estPieceDuBoss) {
        this.description = description;
        this.numeroPiece = numeroPiece;
        this.choixList = new ArrayList<>();
        this.estPieceDuBoss = estPieceDuBoss;
        this.connexions = new ArrayList<>(); // Initialisation de la liste des connexions
    }

    /** GETTER */
    public String getDescriptionPiece() {
        return description;
    }

    public int getNumeroPiece(){
        return numeroPiece;
    }

    public List<Choix> getChoixList() {
        return choixList;
    }

    public boolean isEstPieceDuBoss(){
        return estPieceDuBoss;
    }

    public List<Piece> getConnexions() {
        return connexions; // Getter pour les connexions
    }

    /** SETTER */
    public void ajouterChoix(Choix choix){
        choixList.add(choix);
    }

    public void ajouterConnexion(Piece piece) {
        connexions.add(piece); // Ajouter une pièce à la liste des connexions
    }

    // Méthode pour vérifier si une pièce est connectée
    public boolean estConnecteeAvec(Piece autrePiece) {
        return connexions.contains(autrePiece);
    }
}
