public class Coffre {

    private String descriptionCoffre;
    private int piecesGagnees;

    public Coffre(String descriptionCoffre, int piecesGagnees) {
        this.descriptionCoffre = descriptionCoffre;
        this.piecesGagnees = piecesGagnees;
    }

    public String getDescriptionCoffre() {
        return descriptionCoffre;
    }

    public int getPiecesGagnees() {
        return piecesGagnees;
    }

    public void setDescriptionCoffre(String descriptionCoffre) {
        this.descriptionCoffre = descriptionCoffre;
    }

    public void setPiecesGagnees(int piecesGagnees) {
        this.piecesGagnees = piecesGagnees;
    }
}
