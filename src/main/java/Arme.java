public class Arme extends Item {

    /** Variables d'instance*/
    private String description;
    private int degats;
    private int cout;

    /** Constructeur*/
    public Arme(String nom, String description, int degats, int cout){
        super(nom);
        this.description = description;
        this.degats = degats;
        this.cout = cout;
    }

    /** GETTER */
    public String getDescription(){return description;}
    public int getDegats(){
        return degats;
    }
    public int getCout(){
        return cout;
    }
}
