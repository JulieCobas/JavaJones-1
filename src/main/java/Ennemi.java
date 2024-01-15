public class Ennemi extends Personnage {

    private int degats;

    public Ennemi(String nom, int ennemiVie, int degats) {
        super(nom,ennemiVie);
        this.degats = degats;
    }

    public int getDegats() {
        return degats;
    }


}
