public class Arme1_CouteauABeurre extends Arme {

    /** Constructeur */

    public Arme1_CouteauABeurre() {
        super("Couteau à Beurre",5, 0);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation du" + this.nom);
    }
}
