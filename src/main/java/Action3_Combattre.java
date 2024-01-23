import java.util.Scanner;

public class Action3_Combattre extends Action {

    private Ennemi ennemi;

    public Action3_Combattre(Ennemi ennemi) {
        this.ennemi = ennemi;
    }

    @Override
    public void exectuer(Aventurier joueur) {
        Scanner scanner = new Scanner(System.in); // Ouvrir le scanner

        ennemi.reinitialiserSante();
        boolean continuerCombat = true; // Variable pour continuer le combat ou arrêter

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            💥    ~       Combat d'ennemis        ~     🗡️ ");
        System.out.println("\nCombat avec " + ennemi.getNom() + " || Point de vie : " + ennemi.getVie() + " / Dégats : " + ennemi.getDegats());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while (joueur.getVie() > 0 && ennemi.getVie() > 0 && continuerCombat) { // Tant que le joueur et l'ennemi ont de la vie

            System.out.println("Voulez-vous attaquer (a) ou fuir (f) ?");
            String choix = scanner.nextLine().trim().toLowerCase(); // Lire la saisie manuelle

            if (choix.equals("a")) { // Attaque
                ennemi.setVie(ennemi.getVie() - joueur.getArme().getDegats()); // Réduire la vie de l'ennemi

                if (ennemi.getVie() <= 0) { // Si l'ennemi est vaincu
                    System.out.println("\nVous avez vaincu " + ennemi.getNom() + " !");
                    break;
                }

                else {
                    System.out.println("\nL'ennemi est toujours vivant. Dégâts restants : " + ennemi.getVie() + " ❗");
                }

                // Appliquer les dégâts de l'ennemi au joueur
                joueur.setVie(joueur.getVie()-ennemi.getDegats());
                System.out.println("\nVous avez subi " + ennemi.getDegats() + " points de dégats. 🔻🧡");
                joueur.afficherEtat();

                if (joueur.getVie() <= 0) { // Si le joueur est vaincu
                    System.out.println("\nVous avez été vaincu par " + ennemi.getNom() + "!");
                    break;
                }
            }

            else if (choix.equals("f")) { // Fuir
                System.out.println("\nVous avez fui le combat");
                continuerCombat = false; // Arrêter le combat

            }

            else { // Choix non valide
                System.out.println("\nChoix non valide, veuillez choisir entre attaquer (a) ou fuir (f)");
            }
        }
    }

}
