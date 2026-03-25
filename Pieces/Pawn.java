public class Pawn extends Piece  {

    public Pawn(String color)
    {
        super(color); 
    }

        @Override
    public Boolean move(int x1, int y1, int x2,  int y2)
    {

        if(bounds_check(x1) == false)
        {
            return false;
        }

        if (bounds_check(y1) == false)
        {
            return false;
        }

        if (bounds_check(x2) == false)
        {
            return false;
        }

        if (bounds_check(y2) == false)
        {
            return false; 
        }    

        if (x1 != x2)
        {
            return false; 
        }

        //These two if statements guard against pawns being moved backwards. 
        if (this.color == "white" && y2 < y1)
        {
            return false;
        }

        if (this.color == "black" && y1 < y2)
        {
            return false;
        }


        if ((Math.abs(y1 - y2) > 1))
        {
            return false; 
        }
        
        return true; 
    }

}