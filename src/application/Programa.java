package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Programa {

	public static void main(String[] args) {

		UI.clearScreen();
		Scanner sc = new Scanner(System.in);
		ChessMatch chesMatch = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();
		UI.printBoard(chesMatch.getPieces());

		while (!chesMatch.getCheckMate()) {
			try {
				UI.clearScreen();
				UI.printMacth(chesMatch, captured);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean [][] possibleMoves = chesMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chesMatch.getPieces(), possibleMoves);

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturedPiece = chesMatch.performChessMove(source, target);
				
				if(capturedPiece != null ) {
					captured.add(capturedPiece);
				}
				
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
		UI.clearScreen();
		UI.printMacth(chesMatch, captured);
	}
}
