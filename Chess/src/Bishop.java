public class Bishop extends Piece{


    public boolean isValidMove(Square squareToMoveTo) {
        //Check if piece of same color is already there
        if(squareToMoveTo.piece.pieceColor == this.pieceColor) {
            return false;
        }
        return true;
    }
}
