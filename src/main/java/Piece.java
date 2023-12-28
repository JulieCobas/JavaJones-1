import java.util.ArrayList;
import java.util.List;

public class Piece {

    /** VARIABLES D'INSTANCE */
    private String description;
    private int numeroPiece;
    private List<Choix> choixList;
    private Piece pieceGauche;
    private Piece pieceDroite;
    private Piece pieceToutDroit;
    private Piece pieceRetourEnArriere;
    private boolean estPieceDuBoss;

    /** CONSTRUCTEUR */
    public Piece(String description, int numeroPiece, boolean estPieceDuBoss) {
        this.description = description;
        this.numeroPiece = numeroPiece;
        this.choixList = new ArrayList<>();
        this.estPieceDuBoss = estPieceDuBoss;
    }

    /** GETTER */
    public String getDescription() {
        return description;
    }

    public String getDescriptionPiece() {
        return description;
    }

    public int getNumeroPiece(){
        return numeroPiece;
    }

    public List<Choix> getChoixList() {
        return choixList;
    }

    /** SETTER */
    public boolean isEstPieceDuBoss(){
        return estPieceDuBoss;
    }
    public void ajouterChoix(Choix choix){
        choixList.add(choix);
    }

    public void afficherChoix(){
        for (int i = 0; i < choixList.size(); i++){
            System.out.println((i+1) + "." + choixList.get(i).getDescription());
        }
    }
    /** DEPLACEMENTS*/
    public void setPieceGauche(Piece pieceGauche) {
        this.pieceGauche = pieceGauche;
    }
    public void setPieceDroite(Piece pieceDroite) {
        this.pieceDroite = pieceDroite;
    }
    public void setPieceToutDroit(Piece pieceToutDroit) {
        this.pieceToutDroit = pieceToutDroit;
    }
    public void setPieceRetourEnArriere(Piece pieceRetourEnArriere) {
        this.pieceRetourEnArriere = pieceRetourEnArriere;
    }
    public Piece getPieceGauche() {
        return pieceGauche;
    }
    public Piece getPieceDroite() {
        return pieceDroite;
    }
    public Piece getPieceToutDroit() {
        return pieceToutDroit;
    }
    public Piece getPieceRetourEnArriere() {
        return pieceRetourEnArriere;
    }
}
