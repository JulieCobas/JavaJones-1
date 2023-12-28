public class Arme8_CoupDePoingAmericain extends Arme {

    public Arme8_CoupDePoingAmericain(String nom, int degats, int cout) {
        super("Coup de poing Américain",20, 15);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation de " + this.nom);
    }

}
