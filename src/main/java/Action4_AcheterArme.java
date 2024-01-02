public class Action4_AcheterArme implements Action {

    private String descriptionAchatArme;
    private Arme arme;


    public Action4_AcheterArme(String descriptionAchatArme,Arme arme) {
        this.descriptionAchatArme = descriptionAchatArme;
        this.arme = arme;
    }

    @Override
    public void exectuer(Personnage personnage) {
        if (personnage.getPorteMonnaie() >= arme.getCout()) {
            personnage.setPorteMonnaie(personnage.getPorteMonnaie() - arme.getCout());
            personnage.setArme(arme);
            System.out.println("Vous avez acheté une nouvelle arme : " + arme.getNom());
        } else {
            System.out.println("Vous n'avez pas assez de pièces pour acheter l'arme " + arme.getNom() + ".");
        }
    }
}
