public class Arme11_Mitraillette extends Arme {

    public Arme11_Mitraillette(String nom, int degats, int cout) {
        super("Mitraillette", degats, cout);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation de " + this.nom);
    }
}
