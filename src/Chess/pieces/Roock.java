package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Roock extends ChessPiece {

	public Roock(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
