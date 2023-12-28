public class Arme9_SprayAuPoivre extends Arme {

    public Arme9_SprayAuPoivre(String nom, int degats, int cout) {
        super("Spray au Poivre", 15, 7);
    }


    @Override
    public void utiliser() {
        System.out.println("Utilisation de " + this.nom);
    }
}
