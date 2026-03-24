public class Square {

    Piece resident;
    Boolean color;  

    public Square (Boolean square_color)
    {
        resident = new Blank("blank");
        color = square_color; 
    }

}