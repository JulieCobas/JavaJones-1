public class Action3_Combattre implements Action {

    private Ennemi ennemi;

    public Action3_Combattre(Ennemi ennemi) {
        this.ennemi = ennemi;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setBarreDeVie(personnage.getBarreDeVie()- ennemi.getDegats());
        System.out.println("Vous avez perdu " + ennemi.getDegats() + " points de vie");
    }
}
