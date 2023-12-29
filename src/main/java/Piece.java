import java.util.ArrayList;
import java.util.List;

public class Piece {

    /** VARIABLES D'INSTANCE */
    private String description;
    private int numeroPiece;
    private List<Choix> choixList;
    private boolean estPieceDuBoss;

    /** CONSTRUCTEUR */
    public Piece(String description, int numeroPiece, boolean estPieceDuBoss) {
        this.description = description;
        this.numeroPiece = numeroPiece;
        this.choixList = new ArrayList<>();
        this.estPieceDuBoss = estPieceDuBoss;
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
}
