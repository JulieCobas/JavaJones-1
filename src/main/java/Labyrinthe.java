import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Labyrinthe {
    private List<Piece> pieces;

    /** CONSTRUCTEUR */
    public Labyrinthe() {
        pieces = new ArrayList<>();
    }

    private void initialiserPieces(){

        /** Connecter les pièces */
        //Pièce 1
        pieces.get(0).setPieceDroite(pieces.get(1)); //Pièce 1 connectée à droite à la Pièce 2
        pieces.get(0).setPieceGauche(pieces.get(2)); // Pièce 1 connectée à gauche à la Pièce 3

        //Pièce 2
        pieces.get(1).setPieceRetourEnArriere(pieces.get(0)); // Pièce 2 connectée en arrière à la Pièce 1
        pieces.get(1).setPieceToutDroit(pieces.get(3)); //Piece 2 connectée tout droit à la Pièce 4

        //Pièce 3
        pieces.get(2).setPieceRetourEnArriere(pieces.get(0)); //Pièce 3 connectée en arrière à la Pièce 1
        pieces.get(2).setPieceToutDroit(pieces.get(4)); //Pièce 3 connectée tout droit à la Pièce 5

        //Pièce 4 - Culdesac
        pieces.get(3).setPieceRetourEnArriere(pieces.get(1)); //Pièce 4 connectée en arrière à la Pièce 2

        //Pièce 5
        pieces.get(4).setPieceRetourEnArriere(pieces.get(2)); //Pièce 5 connectée en arrière à la Pièce 3
        pieces.get(4).setPieceToutDroit(pieces.get(5)); //Pièce 5 connectée tout droit à la pièce 6

        //Pièce 6 - Boss Final
        pieces.add(new Piece("Vous êtes face au boss final", 6, true));

        //Ajout des pièces à la liste
        pieces.addAll(Arrays.asList());
    }

    public Piece getPiece(int numeroPiece){
        return pieces.get(numeroPiece - 1);
    }


}


