public class Action5_Rien extends Action {

    private String descriptionRien;

    public Action5_Rien(String descriptionRien) {
        this.descriptionRien = descriptionRien;
    }

    @Override
    public void exectuer(Personnage personnage) {
        System.out.println("Vous n'avez rien obtenu !");
    }
}
