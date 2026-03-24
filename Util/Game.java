public class Game {

    Board game_board; 

    public Game ()
    {
        game_board = new Board(); 
        game_board.reset_board();
    }

    public void print_board()
    {
       System.out.println("  A  B  C  D  E  F  G  H  ");
       
       for (int i = 0; i < 8; i ++)
       {
            System.out.print(8 - i + " ");

            for (int j = 0; j < 8; j++)
            {
                System.out.print(piece_identify(j,  (7 - i)));
                System.out.print(" "); 
            }

            System.out.println(""); 
       }
    }

    public String piece_identify (int x, int y)
    {
        Piece subject = game_board.board[x][y].resident; 

        String piece_name = ""; 

        if(subject.color == "white")
        {
            piece_name = "w";
        }
        else if (subject.color == "black")
        {
            piece_name = "b"; 
        }

        if(subject instanceof Rook)
        {
            piece_name += ("R");
        }
        else if (subject instanceof Knight)
        {
            piece_name += ("N");
        }
        else if (subject instanceof Bishop)
        {
            piece_name += ("B");
        }
        else if (subject instanceof King)
        {
            piece_name += ("K");
        }
        else if (subject instanceof Queen)
        {
            piece_name += ("Q");
        }
        else if (subject instanceof Pawn)
        {
            piece_name += ("p");
        }
        else if (subject instanceof Blank)
        {
            if (game_board.board[x][y].color == false)
            {
                piece_name = "##";
            }
            else
            {
                piece_name = "  "; 
            }
        }


        return piece_name;
    }


}