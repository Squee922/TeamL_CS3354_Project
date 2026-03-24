public abstract class Piece {

    String color; 

    public Piece(String piece_color)
    {
        this.color = piece_color; 
    }

    public abstract Boolean move(int x1, int y1, int x2, int y2);

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