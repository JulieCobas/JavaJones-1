import java.util.Scanner;

public class Action4_AcheterArme extends Action {

    private Arme arme;
    private Aventurier joueur;

    private static final String ACHAT = "oui";
    private static final String NEPASACHETER = "non";
    private Scanner scanner;

    public Action4_AcheterArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public void exectuer(Aventurier aventurier) {

        scanner = new Scanner(System.in);

        // Mise en scène de l'offre d'achat
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                ⚔️   ~ L'Échoppe Mystérieuse du Maître d'Armes ~  💰 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nDevant vous se tient le Maître d'Armes, une silhouette imposante enveloppée dans un manteau de mystères.");
        System.out.println();
        System.out.println("Il vous propose l'arme suivante : ");
        System.out.println();
        System.out.printf(" Arme : %s\n", arme.getNom());
        System.out.printf(" Description : %s\n", arme.getDescription());
        System.out.printf(" Puissance de frappe : %d dégats\n", arme.getDegats());
        System.out.printf(" Coût : %d pièces d'or\n", arme.getCout());
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souhaitez-vous l'acheter? oui/non");
        String reponse;

        while (true) { //Faire une boucle jusqu'à ce que le joueur répond correctement à la question

            //Demander le choix à l'utilisateur
            reponse = joueur.obtenirChoixUtilisateur();

            //Achat d'une arme
            if (reponse.equals(ACHAT)) {

                //Si le joueur a le nombre suffisant de pièces pour acheter l'arme
                if (aventurier.getPorteMonnaie() >= arme.getCout()) {
                    aventurier.setPorteMonnaie(aventurier.getPorteMonnaie() - arme.getCout());
                    aventurier.setArme(arme);
                    System.out.println("Le Maître d'Armes hoche la tête en signe d'approbation.");
                    System.out.println("Vous avez acquis : " + arme.getNom() + " !");
                    break;
                }
                //Si le joueur veut acheter mais il n'a pas assez d'argent
                else {
                    System.out.println("\nLe Maître d'Armes soupire 😔: « Tes pièces ne suffisent pas... Repasse me voir plus tard »\n");
                    break;
                }
            }
            //Ne pas acheter d'arme
            else if (reponse.equals(NEPASACHETER)) {
                System.out.println("«\nUn choix sage, ou peut-être prudent... » 🤠 murmure le Maître d'Armes.");
                break;
            }

            //Réponse de l'utilisateur incorrecte
            else {
                System.out.println("\nLe Maître d'Armes vous regarde perplexe 😕: « Je n'ai pas compris votre réponse... Veuillez répondre par 'oui' ou 'non'.»\n");
            }
        }
    }
}
