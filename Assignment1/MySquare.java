package Assignment1;

/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: creates a square
*/
public class MySquare extends My2DShape{
    //variables
    double side;

    //constructor
    public MySquare(MyPoint topLeft, double side){
        super(topLeft, new MyPoint(topLeft.getX() + side, topLeft.getY()- side));
        this.side = side;

    }
    public MySquare(MyPoint topLeft, MyPoint bottomRight) {
        super(topLeft, bottomRight);
        this.side = topLeft.getY() - bottomRight.getY();
    }
    
    //getters
    public double getSide(){
        return side;
    }

    @Override
    public String getName(){
        return "Square";
    }

    //methods

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }

    @Override
    public String howToDraw() {
        return "Side: " + getSide();
    }

    public String howToColor(){
       if(this.isFilled() == true){
            return "Fill the square with the color " + getColor();
        }else{
            return "Outline the square with the color " + getColor();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" + getCorners() + "\r\n" + howToDraw() + "\r\n" + howToColor();
    }

    
    
    
}
