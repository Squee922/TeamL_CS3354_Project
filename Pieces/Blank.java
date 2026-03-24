class Blank extends Piece {

    public Blank(String color)
    {
        super(color); 
    }

        @Override
    public Boolean move(int x1, int y1, int x2,  int y2)
    {
        System.out.println("Error! There is no piece here.");
        return false; 
    }

}