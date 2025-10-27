
/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: class to create a triangle
*/
public class MyTriangle extends My2DShape {
    //variables
    MyPoint p1,p2,p3;
    double side1,side2,side3;

    public MyTriangle(MyPoint p1, MyPoint p2, MyPoint p3){
        super(p1, p3);
        this.p2 = p2;
        //getting the length of the sides
        this.side1 = (distance(p1, p2));
        this.side2 = (distance(p2, p3));
        this.side3 = (distance(p1, p3));
    }

    // public MyTriangle(double side1, double side2, double side3){
    //     //TODO
    //    // Im not too sure exactly how to get the points just from the length of the sides
    // }

    //getters
    @Override
    public String getName(){
        return "Triange";
    }

    @Override
    public String getCorners(){
        return "P1: " + this.p1 + ", P2: " + this.p2 + ", P3: " + this.p3;
    }

    private double distance(MyPoint a, MyPoint b){
        //sqrt((a.X-b.X)^2+(a.Y-b.Y)^2)
        return (Math.sqrt(Math.pow(a.getX()-b.getX(),2)+(Math.pow(a.getY()-b.getY(), 2))));
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    //methods

    @Override
    public double calculateArea() {
        double semiPerimeter = (side1+side2+side3)/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3)) ;
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String howToDraw() {
        return "Side1: " + getSide1() + ", Side2: " + getSide2() + ", Side3: " + getSide3();
    }
    
    public String howToColor(){
        if(this.isFilled() == true){
            return "Fill the triangle with the color " + getColor();
        }else{
            return "Outline the triangle with the color " + getColor();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" + getCorners() + "\r\n" + howToDraw() + "\r\n" + howToColor();
    }
    
}
