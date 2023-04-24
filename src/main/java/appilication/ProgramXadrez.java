package appilication;



import chess.ChessMatch;

public class ProgramXadrez {
    public static void main (String[]args){

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }

}
