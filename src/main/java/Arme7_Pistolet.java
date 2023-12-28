public class Arme7_Pistolet extends Arme {
    public Arme7_Pistolet(String nom, int degats, int cout) {
        super("Pistolet", 10, 15);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation de " + this.nom);
    }
}
