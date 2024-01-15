public abstract class Personnage {

    /** Variables d'instances*/
    protected String nom;
    protected int vie;


    /** Constructeur*/

    public Personnage (String nom, int vie){
        this.nom = nom;
        this.vie = vie;
    }

    /** Getter */

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    /** Setter */
    public void setVie(int vie) {
        this.vie = vie;
    }
}


