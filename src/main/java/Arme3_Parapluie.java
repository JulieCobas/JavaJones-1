public class Arme3_Parapluie extends Arme {

    public Arme3_Parapluie(String nom, int degats, int cout) {
        super("Parapluie", 10 , 2);
    }

    @Override
    public void utiliser() {
        System.out.println("Utiliser le "  + this.nom);
    }
}
