public  class Board {
    private int boardX = 8;
    private int boardY = 8;
    private Square[][] board = new Square[boardX][boardY];

    public Board() {

    }

    public Square getBoardIJ(int i, int j) {
        return board[i][j];
    }

}
