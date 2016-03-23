import cs1705.tetris.Board;
import cs1705.tetris.Brain;
import cs1705.tetris.Move;
import cs1705.tetris.Piece;

public class AverageBrain implements Brain {

	public void bestMove(Board board, Piece piece, int heightLimit, Move move) {
		move.setScore(1e20);
		int rotationCount = 0;
		while (rotationCount < piece.numRotations()) {
			tryAllColumns(board, piece, heightLimit, move);
			piece = piece.nextRotation();
			++rotationCount;
		}
	}

	public void tryAllColumns(Board board, Piece piece, int heightLimit, Move move) {
		int column = 0;
		while (column < board.getWidth() - piece.getWidth() + 1) {
			double totalRatingForMove = 0.0;
			board.place(piece, column, board.rowAfterDrop(piece, column));
			boolean clearRow = board.clearRows();
			//score for column height
			double scoreForColumnHeight = board.getColumnHeight(column);
			//Add all the scores to the totalRatingForMove
			totalRatingForMove += scoreForColumnHeight;
			if(clearRow) {
				totalRatingForMove -= 2;
			}

			if (totalRatingForMove < move.score()) {
				move.setPiece(piece);
				move.setX(column);
				//move.setY(board.rowAfterDrop(piece, column));
				move.setScore(totalRatingForMove);
			}

			board.undo();
			++column;
		}
	}
}
