public class Action3_Combattre implements Action {

    private String descriptionCombat;
    private Ennemi ennemi;

    public Action3_Combattre(String descriptionCombat,Ennemi ennemi) {
        this.descriptionCombat = descriptionCombat;
        this.ennemi = ennemi;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setBarreDeVie(personnage.getBarreDeVie()- ennemi.getDegats());
        System.out.println("Vous avez perdu " + ennemi.getDegats() + " points de vie");
    }
}
