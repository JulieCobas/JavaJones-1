public class Action1_AugmenterSanter implements Action{

    private String descriptionSante;
    private int pointsDeSante;

    public Action1_AugmenterSanter(String descriptionAction,int pointsDeSante){
        this.descriptionSante = descriptionAction;
        this.pointsDeSante = pointsDeSante;
    }

    /** GETTER */
    public String getDescriptionAction() {
        return descriptionSante;
    }

    public int getPointsDeSante() {
        return pointsDeSante;
    }

    @Override
    public void exectuer(Personnage personnage) {
        int nouvelleSante = personnage.getBarreDeVie() + pointsDeSante;
        if (nouvelleSante > 100) {
            personnage.setBarreDeVie(Personnage.SANTE_MAXIMALE);
            System.out.println("Votre santé est déjà au maximum !");
        }
        else {
            personnage.setBarreDeVie(nouvelleSante);
            System.out.println("Votre santé a été augmentée de " + pointsDeSante);
        }
    }

}
