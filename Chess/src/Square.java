public class Square {
    Piece piece;
    byte xPos, yPos;

    public Square(Piece piece, byte xPos, byte yPos) {
        this.piece = piece;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
