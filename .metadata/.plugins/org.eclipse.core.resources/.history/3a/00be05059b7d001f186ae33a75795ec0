package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chesMatch = new ChessMatch();
		UI.printBoard(chesMatch.getPieces());

		while (true) {
			UI.printBoard(chesMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chesMatch.performChessMove(source, target);
		}

	}
}
