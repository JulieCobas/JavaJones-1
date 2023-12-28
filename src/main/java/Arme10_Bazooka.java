public class Arme10_Bazooka extends Arme {

    public Arme10_Bazooka(String nom, int degats, int cout) {
        super("Bazooka", degats, cout);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation de " + this.nom);
    }
}
