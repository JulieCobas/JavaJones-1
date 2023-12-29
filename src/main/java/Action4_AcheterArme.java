public class Action4_AcheterArme implements Action {

    private Arme arme;

    public Action4_AcheterArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public void exectuer(Personnage personnage) {
        if (personnage.getPorteMonnaie() >= arme.getCout()) {
            personnage.setArme(arme);
            personnage.setPorteMonnaie(personnage.getPorteMonnaie() - arme.getCout());
            System.out.println("Vous avez acheté une nouvelle arme : " + arme.getNom());
        } else {
            System.out.println("Vous n'avez pas assez de pièces pour acheter l'arme " + arme.getNom() + ".");
        }
    }
}
