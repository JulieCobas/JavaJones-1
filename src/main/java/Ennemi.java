public class Ennemi extends Personnage {

    private int degats;
    private int santeInitiale;
    private Aventurier joueur;

    public Ennemi(String nom, int vie, int degats) {
        super(nom, vie);
        this.degats = degats;
        this.santeInitiale = vie;
    }

    public int getDegats() {
        return degats;
    }

    public void reinitialiserSante(){
        setVie(santeInitiale);
    }


}
