public class Ennemi {

    private String nom;
    private int ennemiVie;
    private int degats;

    public Ennemi(String nom, int ennemiVie, int degats) {
        this.nom = nom;
        this.ennemiVie = ennemiVie;
        this.degats = degats;
    }

    public String getNom() {
        return nom;
    }

    public int getEnnemiVie() {
        return ennemiVie;
    }

    public int getDegats() {
        return degats;
    }

    public void setEnnemiVie(int ennemiVie) {
        this.ennemiVie = ennemiVie;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
