
public class Action2_OuvrirTresor implements Action {

    private Coffre coffre;
    private String descriptionOuvrirTresor;

    public Action2_OuvrirTresor(String descriptionOuvrirTresor, Coffre coffre) {
        this.descriptionOuvrirTresor = descriptionOuvrirTresor;
        this.coffre = coffre;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setPorteMonnaie(personnage.getPorteMonnaie()+ coffre.getPiecesGagnees());
        System.out.println("Vous avez un coffre de " + coffre.getPiecesGagnees() + " pièces d'or .");

    }
}
