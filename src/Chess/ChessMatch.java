package Chess;


import Chess.pieces.King;
import Chess.pieces.Roock;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		 board = new Board(8, 8);
		 initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Roock(board, Color.white), new Position(2, 1));
		board.placePiece(new King(board, Color.black ), new Position(0, 4));
		board.placePiece(new King(board, Color.white ), new Position(7, 4));
	}
}
