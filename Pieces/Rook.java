public class Rook extends Piece {

    public Rook(String color)
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

        if ((x1 != x2) && (y1 != y2))
        {
            return false; 
        }
        
        return true; 
    }

}