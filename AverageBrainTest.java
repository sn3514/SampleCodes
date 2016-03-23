
import org.junit.Assert;
import org.junit.Test;

import cs1705.tetris.Board;
import cs1705.tetris.Brain;
import cs1705.tetris.Move;
import cs1705.tetris.Piece;

public class AverageBrainTest {
	
	@Test
    public void testLonRow0()
    {
        Board board = new Board( 10, 24, new String[]{
            "#### #####"
        });
        Piece piece   = Piece.getPiece( Piece.RIGHT_L, 0 );
        Move  move    = new Move();
        Brain myBrain = new AverageBrain();

        myBrain.bestMove( board, piece, 20, move );

        board.apply( move );

        Assert.assertEquals( 
                      new Board( 10, 24, new String[]{
                          "    ###   "
                      } ), board );
    }
	
	@Test
	public void testLeftDogPiece() {
		
        Board board = new Board( 10, 24, new String[]{
            "###### ###"
        });
        Piece piece   = Piece.getPiece( Piece.LEFT_DOG, 0 );
        Move  move    = new Move();
        Brain myBrain = new AverageBrain();

        myBrain.bestMove( board, piece, 20, move );
        
        board.apply( move );
        
        Assert.assertEquals( 
                new Board( 10, 24, new String[]{
                    "       #  ",
                	"      ##  "
                } ), board );
		
	}
	
	@Test
	public void testStickPieceInVertical() {
		
        Board board = new Board( 10, 24, new String[]{
            "###### ###"
        });
        Piece piece   = Piece.getPiece( Piece.STICK, 0 );
        Move  move    = new Move();
        Brain myBrain = new AverageBrain();

        myBrain.bestMove( board, piece, 20, move );
        
        board.apply( move );
        
        Assert.assertEquals( 
                new Board( 10, 24, new String[]{
                    "      #   ",
                	"      #   ",
                	"      #   "
                } ), board );
		
	}
	
	@Test
	public void testRightDog() {
        Board board = new Board( 10, 24, new String[]{
                "#####  ###"
            });
            Piece piece   = Piece.getPiece( Piece.RIGHT_DOG, 0 );
            Move  move    = new Move();
            Brain myBrain = new AverageBrain();

            myBrain.bestMove( board, piece, 20, move );
            
            board.apply( move );
            
            Assert.assertEquals( 
                    new Board( 10, 24, new String[]{
                    	"      ##  "
                    } ), board );
	}

	@Test
	public void testLeftL() {
        Board board = new Board( 10, 24, new String[]{
                "#####  ###"
            });
            Piece piece   = Piece.getPiece( Piece.LEFT_L, 0 );
            Move  move    = new Move();
            Brain myBrain = new AverageBrain();

            myBrain.bestMove( board, piece, 20, move );
            
            board.apply( move );
            
            Assert.assertEquals( 
                    new Board( 10, 24, new String[]{
                    	"      #   ",
                    	"      #   "
                    } ), board );
	}
	
	@Test
	public void testStickInVerticalWithNoBlocks() {
        Board board = new Board( 10, 24, new String[]{
                "##### ####",
                "##### ####",
                "##### ####",
                "##### ####"
            });
            Piece piece   = Piece.getPiece( Piece.STICK, 0 );
            Move  move    = new Move();
            Brain myBrain = new AverageBrain();

            myBrain.bestMove( board, piece, 20, move );
            
            board.apply( move );
            
            Assert.assertEquals( 
                    new Board( 10, 24, new String[]{
                    	"          "
                    } ), board );
	}


}
