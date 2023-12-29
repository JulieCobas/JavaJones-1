public class Action3_Combattre implements Action {

    private String descriptionCombat;
    private int degats;

    public Action3_Combattre(String descriptionCombat,int degats) {
        this.descriptionCombat = descriptionCombat;
        this.degats = degats;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setBarreDeVie(personnage.getBarreDeVie()- degats);
        System.out.println("Vous avez perdu " + degats + " points de vie");
    }
}
