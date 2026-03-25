import java.util.Scanner; 


public class Main {
    public static void main(String[] args) {
        

        Game game = new Game();
        game.print_board();

        
        while (game.live = true)
        {
            game.move_piece(game.prompt_user()); 
            
            if (game.turn == true)
            {
                game.turn = false;
            }
            else
            {
                game.turn = true; 
            }


        }


    }
}