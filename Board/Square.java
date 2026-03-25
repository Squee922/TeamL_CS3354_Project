//The square class contains a color (primarily stored for display purposes)
//as well as a resident, which is the piece that is currently sitting on that square. 

public class Square {

    Piece resident;
    Boolean color;  

    public Square (Boolean square_color)
    {
        resident = new Blank("blank");
        color = square_color; 
    }

}