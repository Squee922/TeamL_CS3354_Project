public class Board {

    Square[][] board = new Square[8][8];

    public Board ()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                board[i][j] = new Square(); 
            }
        }
    }

    public void reset_board () 
    {
        board[0][0].resident = new Rook("white"); 
        board[1][0].resident = new Knight("white"); 
        board[2][0].resident = new Bishop("white");
        board[3][0].resident = new Queen("white");
        board[4][0].resident = new King("white");
        board[5][0].resident = new Bishop("white");
        board[6][0].resident = new Knight("white");
        board[7][0].resident = new Rook("white");

        for (int i = 0; i < 8; i++)
        {
            board[i][1].resident = new Pawn("white");
        }

        board[0][7].resident = new Rook("black"); 
        board[1][7].resident = new Knight("black"); 
        board[2][7].resident = new Bishop("black");
        board[3][7].resident = new Queen("black");
        board[4][7].resident = new King("black");
        board[5][7].resident = new Bishop("black");
        board[6][7].resident = new Knight("black");
        board[7][7].resident = new Rook("black");

        for (int i = 0; i < 8; i++)
        {
            board[i][6].resident = new Pawn("black");
        }


    }

    



}