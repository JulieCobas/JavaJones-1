public abstract class Arme {

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
    /** Utiliser arme*/
    public abstract void utiliser();

    /** Nom de l'arme */
    public String getNom(){
        return nom;
    }

    /** Infliger des dégats */
    public int getDegats(){
        return degats;
    }

    /** Coût d'achat de l'arme*/
    public int getCout(){
        return cout;
    }
}
