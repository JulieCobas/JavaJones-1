
public class Action2_OuvrirTresor extends Action {

    private Coffre coffre;

    //Construction d'une action pour ouvrir un coffre (de pièces)
    public Action2_OuvrirTresor(Coffre coffre) {
        this.coffre = coffre;
    }

    //Récupération de l'aventurier en paramètre pour effectuer les changements
    @Override
    public void exectuer(Aventurier aventurier) {

        //Modification du porte-monnaie du joueur en fonction de l'état actuel de son porte monnaie et ce que contient le coffre
        aventurier.setPorteMonnaie(aventurier.getPorteMonnaie()+ coffre.getPiecesGagnees());

        // Mise en scène de l'offre de l'obtention d'un coffre de pièces
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                                       \n" +
                "          |                   |                  |                     |\n" +
                " _________|________________.=\"\"_;=.______________|_____________________|_______\n" +
                "|                   |  ,-\"_,=\"\"     `\"=.|                  |\n" +
                "|___________________|__\"=._o`\"-._        `\"=.______________|___________________\n" +
                "          |                `\"=._o`\"=._      _`\"=._                     |\n" +
                " _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______\n" +
                "|                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |\n" +
                "|___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________\n" +
                "          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |\n" +
                " _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______\n" +
                "|                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |\n" +
                "|___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________\n" +
                "____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____\n" +
                "/______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_\n" +
                "____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____\n" +
                "/______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_\n" +
                "____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____\n" +
                "/______/______/______/______/______/______/______/______/______/______/_____\n" );
        System.out.println("Vous avez trouvé un coffre 💰 : " + coffre.getNom() + ". Il vaut " + coffre.getPiecesGagnees() + " pièces d'or.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    }
}
