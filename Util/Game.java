public class Game {

    Board game_board; 
    Player player_white;
    Player player_black; 

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

       System.out.println("");
       System.out.println("");
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

    public void move_piece(String command)
    {
        int x1, y1, x2, y2;  

        x1 = coord_assign(command.charAt(0));
        y1 = command.charAt(1) - ('0' + 1);

        x2 = coord_assign(command.charAt(3));
        y2 = command.charAt(4) - ('0' + 1);

        if(game_board.board[x1][y1].resident.move(x1, y1, x2, y2))
        {
            game_board.board[x2][y2].resident = game_board.board[x1][y1].resident;
            game_board.board[x1][y1].resident = new Blank("blank");
        }

        print_board();

    }

    public int coord_assign(char letter)
    {
        int coord = 1000;
        System.out.println(letter);

        if (letter == 'A')
        {
            coord = 0; 
        }
        else if (letter == 'B')
        {
            coord = 1;
        }
        else if (letter == 'C')
        {
            coord = 2;
        }
        else if (letter == 'D')
        {
            coord = 3;
        }
         else if (letter == 'E')
        {
            coord = 4;
        }
         else if (letter == 'F')
        {
            coord = 5;
        }
         else if (letter == 'G')
        {
            coord = 6;
        }
         else if (letter == 'H')
        {
            coord = 7;
        }

        return coord;


    }


}