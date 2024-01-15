public abstract class Item {

    /** Variables d'instances*/
    protected String nom;

    /** Constructeur */
    public Item(String nom){
        this.nom = nom;
    }

    /** Getter */
    public String getNom() {
        return nom;
    }
}
