import java.sql.SQLOutput;
import java.util.Scanner;

public class Action3_Combattre implements Action {

    private String descriptionCombat;
    private Ennemi ennemi;

    public Action3_Combattre(String descriptionCombat,Ennemi ennemi) {
        this.descriptionCombat = descriptionCombat;
        this.ennemi = ennemi;
    }

    @Override
    public void exectuer(Personnage personnage) {
        Scanner scanner = new Scanner(System.in); // Ouvrir le scanner
        boolean continuerCombat = true; // Variable pour continuer le combat ou arrêter

        System.out.println("Combat avec " + ennemi.getNom() + "! Point de vie : " + ennemi.getEnnemiVie() + " / Dégats : " + ennemi.getDegats());
        while (personnage.getBarreDeVie() > 0 && ennemi.getEnnemiVie() > 0 && continuerCombat) { // Tant que le joueur et l'ennemi ont de la vie

            System.out.println("Voulez-vous attaquer (a) ou fuir (f) ?");
            String choix = scanner.nextLine().trim().toLowerCase(); // Lire la saisie manuelle

            if (choix.equals("a")) { // Attaque
                ennemi.setEnnemiVie(ennemi.getEnnemiVie() - personnage.getArme().getDegats()); // Réduire la vie de l'ennemi

                if (ennemi.getEnnemiVie() <= 0) { // Si l'ennemi est vaincu
                    System.out.println("Vous avez vaincu " + ennemi.getNom() + " !");
                    break;
                }

                else {
                    System.out.println("" + ennemi.getNom() + " est toujours vivant. Dégâts restants : " + ennemi.getEnnemiVie());
                }

                // Appliquer les dégâts de l'ennemi au joueur
                personnage.setBarreDeVie(personnage.getBarreDeVie() - ennemi.getDegats());
                System.out.println("Vous avez subi " + ennemi.getDegats() + " points de dégats.");
                personnage.afficherEtat();

                if (personnage.getBarreDeVie() <= 0) { // Si le joueur est vaincu
                    System.out.println("Vous avez été vaincu par " + ennemi.getNom() + "!");
                    break;
                }
            }

            else if (choix.equals("f")) { // Fuir
                System.out.println("Vous avez fui le combat");
                continuerCombat = false; // Arrêter le combat

            }

            else { // Choix non valide
                System.out.println("Choix non valide, veuillez choisir entre attaquer (a) ou fuir (f)");
            }
        }
    }

}
