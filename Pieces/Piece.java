//The piece class is an abstract class
//It stores the color of the piece as well as utility and 
//abstract methods used in determining piece movement

public abstract class Piece {

    String color; 

    public Piece(String piece_color)
    {
        this.color = piece_color; 
    }

    public abstract Boolean move(int x1, int y1, int x2, int y2);


    //This method checks to see if a user has attempted to move the
    //piece to a location not on the chessboard
    public Boolean bounds_check(int bound)
    {
        Boolean valid = true;

        if (bound > 7 || bound < 0)
        {
            valid = false; 
            System.out.println(bound);
            System.out.println("Error! Move out of bounds!"); 
        }

        return valid;
    }


}