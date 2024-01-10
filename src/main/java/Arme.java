public class Arme {

    /** Variables d'instance*/
    private String nom;
    private String description;
    private int degats;
    private int cout;

    /** Constructeur*/
    public Arme(String nom, String description, int degats, int cout){
        this.nom = nom;
        this.description = description;
        this.degats = degats;
        this.cout = cout;
    }

    /** GETTER */
    public String getNom(){
        return nom;
    }
    public String getDescription(){return description;}
    public int getDegats(){
        return degats;
    }
    public int getCout(){
        return cout;
    }
}
