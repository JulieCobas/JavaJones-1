
public class Action2_OuvrirTresor implements Action {

    private int piecesGagnees;

    public Action2_OuvrirTresor(int piecesGagnees){
        this.piecesGagnees = piecesGagnees;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setPorteMonnaie(personnage.getPorteMonnaie()+piecesGagnees);
        System.out.println("Vous avez gagné " + piecesGagnees + "pièces d'or .");

    }
}
