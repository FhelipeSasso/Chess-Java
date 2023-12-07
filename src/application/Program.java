package application;

import Chess.ChessMatch;
import boardGame.Board;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
	}
}
