public abstract class Piece {

    String color; 

    public Piece(String piece_color)
    {
        this.color = piece_color; 
    }

    public abstract Boolean move(int x1, int y1, int x2, int y2);


}