/**
 * Created by bayfoleycox on 3/13/2017.
 */
public  class Board {
    private int boardX = 8;
    private int boardY = 8;
    Square[][] board = new Square[boardX][boardY];

    public Board() {

    }

    public Piece getBoardIJ(int i, int j) {
        return board[i][j];
    }

    public void setBoardIJ() {
        this.board = board;
    }
}
