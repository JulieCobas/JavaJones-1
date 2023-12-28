public class Arme6_BaguetteMagique extends Arme {

    public Arme6_BaguetteMagique(String nom, int degats, int cout) {
        super("Baguette Magique", 10, 15);
    }

    @Override
    public void utiliser() {
        System.out.println("Utiisation de" + this.nom);

    }

}
