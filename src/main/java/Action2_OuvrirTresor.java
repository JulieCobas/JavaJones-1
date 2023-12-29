
public class Action2_OuvrirTresor implements Action {

    private String descriptionCoffre;
    private int piecesGagnees;

    public Action2_OuvrirTresor(String descriptionCoffre,int piecesGagnees){
        this.descriptionCoffre = descriptionCoffre;
        this.piecesGagnees = piecesGagnees;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setPorteMonnaie(personnage.getPorteMonnaie()+ piecesGagnees);
        System.out.println("Vous avez un coffre de " + piecesGagnees + " pièces d'or .");

    }
}
