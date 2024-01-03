import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Piece {

    /** VARIABLES D'INSTANCE */
    private String nom;
    private String description;
    private int numeroPiece;
    private List<Choix> choixList;
    private boolean estPieceDuBoss;
    private List<Piece> connexions; // Ajout pour gérer les connexions

    /** CONSTRUCTEUR */
    public Piece(String nom, String description, int numeroPiece, boolean estPieceDuBoss) {
        this.nom = nom;
        this.description = description;
        this.numeroPiece = numeroPiece;
        this.choixList = new ArrayList<>();
        this.estPieceDuBoss = estPieceDuBoss;
        this.connexions = new ArrayList<>(); // Initialisation de la liste des connexions
    }

    /** GETTER */
    public String getNomPiece() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getNumeroPiece(){
        return numeroPiece;
    }

    public List<Choix> getChoixList() {
        return choixList;
    }

    public boolean isEstPieceDuBoss(){
        return estPieceDuBoss;
    }

    public List<Piece> getConnexions() {
        return connexions; // Getter pour les connexions
    }

    /** SETTER */
    public void ajouterChoix(Choix choix){
        choixList.add(choix);
    }

    public void ajouterConnexion(Piece piece) {
        connexions.add(piece); // Ajouter une pièce à la liste des connexions
    }

    // Méthode pour vérifier si une pièce est connectée
    public boolean estConnecteeAvec(Piece autrePiece) {
        return connexions.contains(autrePiece);
    }

    public void afficherDescriptionPiece() {
        // Affiche le nom de la pièce
        System.out.println("+--------------------------------------+");
        System.out.println("|       " + getNomPiece() + "         |");
        System.out.println("+--------------------------------------+\n");

        // Divise la description en segments plus courts
        String[] lignesDescription = getDescription().split(", ");
        for (String ligne : lignesDescription) {
            System.out.println(ligne.trim());
        }
        System.out.println();
    }

    public void afficherChoixPiece() {
        System.out.println("\nCertains choix s'offrent à vous : ");
        for (int i = 0; i < choixList.size(); i++) {
            System.out.println((i + 1) + ". " + choixList.get(i).getDescription());
        }
    }

    public Choix demanderChoixJoueur(Scanner scanner){
        System.out.println("Veuillez choisir une option (entrez le numéro 1/2/3/4)");
        int choixJoueur;
        try {
            choixJoueur = Integer.parseInt(scanner.nextLine().trim());
            if (choixJoueur > 0 && choixJoueur <= choixList.size()) {
                return choixList.get(choixJoueur - 1);
            } else {
                System.out.println("Choix invalide. Veuillez réessayer.");
                return demanderChoixJoueur(scanner);
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre.");
            return demanderChoixJoueur(scanner);
        }
    }



}
