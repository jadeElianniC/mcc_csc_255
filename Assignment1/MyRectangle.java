package Assignment1;

/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: creating a rectangle
*/
public class MyRectangle extends My2DShape {
    //variables
    double width, height;

    public MyRectangle(MyPoint topLeft, double width, double height){
        super(topLeft, new MyPoint(topLeft.getX()+ width, topLeft.getY()-height));
        this.width = width;
        this.height = height;
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        super(topLeft, bottomRight);
        this.width = bottomRight.getX()-topLeft.getX();
        this.height = topLeft.getY()-bottomRight.getY();
    }

    //getters
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public String getName(){
        return "Rectangle";
    }

    //methods
    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return (2*width)+(2*height);
    }

    @Override
    public String howToDraw() {
        return "Width: " + getWidth() + ", Height: " + getHeight();
    }

    public String howToColor(){
        if(this.isFilled() == true){
            return "Fill the rectangle with the color " + getColor();
        }else{
            return "Outline the rectangle with the color " + getColor();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" + getCorners() + "\r\n" + howToDraw() + "\r\n" + howToColor();
    }
    
    
}

