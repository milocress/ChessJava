/**
 * Created by bayfoleycox on 3/13/2017.
 */
public class Bishop extends Piece{


    public boolean isValidMove(Square squareToMoveTo) {
        //Check if piece of same color is already there
        if(squareToMoveTo.piece != null && squareToMoveTo.piece.pieceColor == this.pieceColor) {
            return false;
        }

    }
}
