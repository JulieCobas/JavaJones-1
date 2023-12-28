import java.util.Random;

public class Coffre {
    private TailleCoffre taille;
    private int pieces;

    public Coffre() {
        this.taille = genererTailleAleatoire();
        this.pieces = PieceEnFonctionDeLaTaille(this.taille);
    }

    private TailleCoffre genererTailleAleatoire() {
        TailleCoffre[] tailles = TailleCoffre.values();
        Random random = new Random();
        return tailles[random.nextInt(tailles.length)];
    }

    private int PieceEnFonctionDeLaTaille(TailleCoffre taille) {
        switch (taille) {
            case PETIT:
                return 10; // Nombre de pièces pour un petit coffre
            case MOYEN:
                return 50; // Nombre de pièces pour un moyen coffre
            case GRAND:
                return 100; // Nombre de pièces pour un grand coffre
            default:
                return 0;
        }
    }

    public void ouvrirCoffre() {
        System.out.println("Vous avez ouvert un coffre " + this.taille + " avec " + this.pieces + " pièces.");
    }
}
