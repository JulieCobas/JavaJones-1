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
        Scanner scanner = new Scanner(System.in);
        while (personnage.getBarreDeVie() > 0 && ennemi.getEnnemiVie() > 0) {
            System.out.println("Combat avec " + ennemi.getNom() + "! Voulez-vous attaquer (a) ou fuir (f)?");
            String choix = scanner.nextLine().trim().toLowerCase();
            if (choix.equals("a")) {
                ennemi.setEnnemiVie(ennemi.getEnnemiVie() - personnage.getArme().getDegats());
                if (ennemi.getEnnemiVie() <= 0) {
                    System.out.println("Vous avez vaincu " + ennemi.getNom() + "!");
                    break;
                }
                personnage.setBarreDeVie(personnage.getBarreDeVie() - ennemi.getDegats());
                if (personnage.getBarreDeVie() <= 0) {
                    System.out.println("Vous avez été vaincu par " + ennemi.getNom() + "!");
                }
            } else if (choix.equals("f")) {
                System.out.println("Vous avez fui le combat.");
                break;
            } else {
                System.out.println("Choix non valide, veuillez réessayer.");
            }
        }
    }

}
