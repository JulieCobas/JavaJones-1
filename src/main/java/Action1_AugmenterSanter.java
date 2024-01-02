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
        if (personnage.getBarreDeVie() <= 100) {
            personnage.setBarreDeVie(personnage.getBarreDeVie() + pointsDeSante);
            System.out.println("Votre santé a été augmenté de " + pointsDeSante);
        }
        else {
            personnage.setBarreDeVie(100);
        }
    }

}
