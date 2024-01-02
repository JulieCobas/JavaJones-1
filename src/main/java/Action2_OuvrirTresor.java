
public class Action2_OuvrirTresor implements Action {


    @Override
    public void exectuer(Personnage personnage) {
        personnage.setPorteMonnaie(personnage.getPorteMonnaie()+ piecesGagnees);
        System.out.println("Vous avez un coffre de " + piecesGagnees + " pièces d'or .");

    }
}
