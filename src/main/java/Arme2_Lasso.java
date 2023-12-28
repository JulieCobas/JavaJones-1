public class Arme2_Lasso extends Arme {

    /** Constructeur */

    public Arme2_Lasso() {
        super("Lasso",6, 0);
    }

    @Override
    public void utiliser() {
        System.out.println("Utilisation du" + this.nom);
    }
}
