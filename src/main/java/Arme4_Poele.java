public class Arme4_Poele extends Arme {
    public Arme4_Poele(String nom, int degats, int cout) {
        super("Poele", 11, 6);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation de " + this.nom);
    }


}
