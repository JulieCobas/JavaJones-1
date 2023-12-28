public class Arme5_PlancheEnBois extends Arme {
    public Arme5_PlancheEnBois(String nom, int degats, int cout) {
        super("Planche en Bois", 11, 6);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation de" + this.nom);
    }


}
