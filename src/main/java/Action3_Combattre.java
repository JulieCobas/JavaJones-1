import java.util.Scanner;

public class Action3_Combattre extends Action {

    private static final String ATTAQUER = "a";
    private static final String FUIR = "f";

    private Scanner scanner;
    private Ennemi ennemi;


    public Action3_Combattre(Ennemi ennemi) {
        this.ennemi = ennemi;
    }

    @Override
    public void exectuer(Aventurier aventurier) {
        scanner = new Scanner(System.in); // Ouvrir le scanner

        ennemi.reinitialiserSante(); //Réinitiliser la vie de l'ennemi problème pour revenir dans une pièce

        boolean continuerCombat = true; // Variable pour continuer le combat ou arrêter

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            💥    ~       Combat d'ennemis        ~     🗡️ ");
        System.out.println("\nCombat avec " + ennemi.getNom() + " || Point de vie : " + ennemi.getVie() + " / Dégats : " + ennemi.getDegats());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        while (aventurier.getVie() > 0 && ennemi.getVie() > 0 && continuerCombat) { // Tant que le joueur et l'ennemi ont de la vie

            System.out.println("Voulez-vous attaquer (a) ou fuir (f) ?");

            //Demander à l'utilisateur le choix qu'il a fait.
            String choix = aventurier.obtenirChoixUtilisateur();

            if (choix.equals(ATTAQUER)) { // Attaque
                ennemi.setVie(ennemi.getVie() - aventurier.getArme().getDegats()); // Réduire la vie de l'ennemi

                // Si la vie de l'ennemi est inférieur à 0
                if (ennemi.getVie() <= 0) { // Si l'ennemi est vaincu
                    System.out.println("\nVous avez vaincu " + ennemi.getNom() + " !");
                    break;
                }

                //Si l'ennemi est toujours vivant à chaque attaque
                else {
                    System.out.println("\nL'ennemi est toujours vivant. Dégâts restants : " + ennemi.getVie() + " ❗");
                }

                // A chaque attaque appliquer les dégâts de l'ennemi au joueur
                aventurier.setVie(aventurier.getVie() - ennemi.getDegats());
                System.out.println("\nVous avez subi " + ennemi.getDegats() + " points de dégats. 🔻🧡");
                aventurier.afficherEtat();

                //Si l'aventurier n'a plus de vie
                if (aventurier.getVie() <= 0) { // Si le joueur est vaincu
                    System.out.println("\nVous avez été vaincu par " + ennemi.getNom() + "!");
                    break;
                }
            }

            //Fuir le combat
            else if (choix.equals(FUIR)) { // Fuir
                System.out.println("\nVous avez fui le combat");
                continuerCombat = false; // Arrêter le combat

            }

            //Choix non valide
            else {
                System.out.println("\nChoix non valide, veuillez choisir entre attaquer (a) ou fuir (f)");
            }
        }
    }

}
