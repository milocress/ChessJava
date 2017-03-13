import java.awt.*;

public abstract class Piece {
    byte xPos, yPos;
    boolean isCaptured;
    Color pieceColor;

    public byte getxPos() {
        return xPos;
    }

    public void setxPos(byte xPos) {
        this.xPos = xPos;
    }

    public byte getyPos() {
        return yPos;
    }

    public void setyPos(byte yPos) {
        this.yPos = yPos;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }

    public abstract boolean isValidMove(Square squareToMoveTo);

}
