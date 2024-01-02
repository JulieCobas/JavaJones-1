
public class Action2_OuvrirTresor implements Action {

    private Coffre coffre;

    public Action2_OuvrirTresor(Coffre coffre) {
        this.coffre = coffre;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setPorteMonnaie(personnage.getPorteMonnaie()+ coffre.getPiecesGagnees());
        System.out.println("Vous avez un coffre de " + coffre.getPiecesGagnees() + " pièces d'or .");

    }
}
