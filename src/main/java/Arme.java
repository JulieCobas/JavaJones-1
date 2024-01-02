public class Arme {

    /** Variables d'instance*/
    private String nom;
    private int degats;
    private int cout;

    /** Constructeur*/
    public Arme(String nom,int degats, int cout){
        this.nom = nom;
        this.degats = degats;
        this.cout = cout;
    }

    /** GETTER */
    public String getNom(){
        return nom;
    }
    public int getDegats(){
        return degats;
    }
    public int getCout(){
        return cout;
    }
}
