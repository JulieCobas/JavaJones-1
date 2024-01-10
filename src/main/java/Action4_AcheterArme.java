import java.util.Scanner;

public class Action4_AcheterArme implements Action {

    private Arme arme;


    public Action4_AcheterArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public void exectuer(Personnage personnage) {
        Scanner scanner = new Scanner(System.in);

        // Mise en scène de l'offre d'achat
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   ⚔️    ~ L'Échoppe Mystérieuse du Maître d'Armes ~  💰 ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Devant vous se tient le Maître d'Armes, une silhouette");
        System.out.println("imposante enveloppée dans un manteau de mystères.");
        System.out.println();
        System.out.println("Il vous propose l'arme suivante : ");
        System.out.println();
        System.out.printf("    Arme : %s\n", arme.getNom());
        System.out.printf("    Puissance de frappe : %d dégats\n", arme.getDegats());
        System.out.printf("    Coût : %d pièces d'or\n", arme.getCout());
        System.out.println();
        System.out.println("Souhaitez-vous l'acheter? oui/non");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String reponse;

        while (true) {

            reponse = scanner.nextLine().trim().toLowerCase();

            if (reponse.equals("oui")) {
                if (personnage.getPorteMonnaie() >= arme.getCout()) {
                    personnage.setPorteMonnaie(personnage.getPorteMonnaie() - arme.getCout());
                    personnage.setArme(arme);
                    System.out.println("Le Maître d'Armes hoche la tête en signe d'approbation.");
                    System.out.println("Vous avez acquis : " + arme.getNom() + " !");
                    break;
                } else {
                    System.out.println("Le Maître d'Armes soupire : « Tes pièces ne suffisent pas... Repasse me voir plus tard \n»");
                    break;
                }
            } else if (reponse.equals("non")) {
                System.out.println("« Un choix sage, ou peut-être prudent... » murmure le Maître d'Armes.");
                break;
            } else {
                System.out.println("Le Maître d'Armes vous regarde perplexe : « Je n'ai pas compris ta réponse... Veuillez répondre par 'oui' ou 'non'.\n »");
            }
        }

    }

}
