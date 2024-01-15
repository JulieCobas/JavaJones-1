public class Action1_AugmenterSanter extends Action {

    private int pointsDeSante;

    public Action1_AugmenterSanter(int pointsDeSante){
        this.pointsDeSante = pointsDeSante;
    }

    /** GETTER */

    @Override
    public void exectuer(Personnage personnage) {
        int nouvelleSante = personnage.getBarreDeVie() + pointsDeSante;
        if (nouvelleSante > 100) {
            personnage.setBarreDeVie(Personnage.SANTE_MAXIMALE);
            System.out.println("\nVous avez trouvé de la vie !");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠶⢦⣤⠶⠶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠁⠀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢧⣄⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠉⠛⠃⣠⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠉⠙⢳⣄⢀⡾⠁⠈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⠀⠀⠙⢿⡇⠀⢰⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⡀⠀⠀⠹⣦⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⣄⠀⠀⠈⠻⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠋⠛⢧⡀⠀⠀⠘⢷⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡴⠾⣧⡀⠀⠀⠹⣦⠀⠀⠈⢿⡄⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⠀⠀⠈⠻⣄⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⢠⡟⠉⠛⢷⣄⠀⠀⠈⠀⠀⠀⠀⠀⠀⣰⠏⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠉⠃⠀⠀⠀⠀⠀⠀⠀⣴⠏⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣦⡀⠀⠀⠀⠀⠀⠀⢀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠶⣤⣤⣤⡤⠶⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀             \n"+
                    "       Votre santé est déjà au maximum ! \uD83D\uDC9A");
            System.out.println();
        }
        else {
            personnage.setBarreDeVie(nouvelleSante);
            System.out.println("\nVous avez trouvé de la vie !");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠶⢦⣤⠶⠶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠁⠀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢧⣄⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠉⠛⠃⣠⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠉⠙⢳⣄⢀⡾⠁⠈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡄⠀⠀⠙⢿⡇⠀⢰⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⡀⠀⠀⠹⣦⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⣄⠀⠀⠈⠻⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠋⠛⢧⡀⠀⠀⠘⢷⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡴⠾⣧⡀⠀⠀⠹⣦⠀⠀⠈⢿⡄⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⠀⠀⠈⠻⣄⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⢠⡟⠉⠛⢷⣄⠀⠀⠈⠀⠀⠀⠀⠀⠀⣰⠏⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠉⠃⠀⠀⠀⠀⠀⠀⠀⣴⠏⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣦⡀⠀⠀⠀⠀⠀⠀⢀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠶⣤⣤⣤⡤⠶⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"+
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀             \n");
            System.out.println("\nVotre santé a été augmentée de " + pointsDeSante + "points de vie !");
        }
    }

}
