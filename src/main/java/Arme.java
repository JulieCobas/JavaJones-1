public class Arme {

    /** Variables d'instance*/
    protected String nom;
    protected int degats;
    protected int cout;

    /** Constructeur*/
    public Arme(String nom,int degats, int cout){
        this.nom = nom;
        this.degats = degats;
        this.cout = cout;
    }

    /** SETTER */
    public void utiliser(){};

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
