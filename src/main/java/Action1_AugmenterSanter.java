public class Action1_AugmenterSanter implements Action{

    private int pointsDeSante;

    public Action1_AugmenterSanter(int pointsDeSante){
        this.pointsDeSante = pointsDeSante;
    }

    @Override
    public void exectuer(Personnage personnage) {
        personnage.setBarreDeVie(personnage.getBarreDeVie()+pointsDeSante);
        System.out.println("Votre santé a été augmenté de " + pointsDeSante);

    }

}
