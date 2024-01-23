public class Coffre extends Item {

    /** Variables d'instances */
    private int piecesGagnees;

    /** Constructeur */
    public Coffre(String nom, int piecesGagnees) {
        super(nom);
        this.piecesGagnees = piecesGagnees;
    }

    /** Getter */
    public int getPiecesGagnees() {
        return piecesGagnees;
    }
}

