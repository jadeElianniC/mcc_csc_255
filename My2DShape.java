
/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: To create the points and get the points for any 2D Shape
*/
public abstract class My2DShape extends MyShape implements Comparable<My2DShape> {
    //variables
    MyPoint topLeft,bottomRight;
    boolean filled;

    //constructors
    public My2DShape(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    //abstract methods
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract String howToDraw();

    //getters
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public MyPoint getTopLeft(){
        return topLeft;
    }
    public boolean isFilled(){
        return filled;
    }

    //setters
    public void setFilled(boolean isFilled){
        filled = isFilled;
    }
    public String getCorners(){
        return "Top Left Corner = " + topLeft + "\nBottom Right Corner = " + bottomRight;
    }
    
    //methods
    @Override
    public boolean equals(Object obj) {
        if(getClass() != obj.getClass()){
            return false;
        }
        My2DShape myObj = (My2DShape)obj;
        return this.equals(myObj);
    }

  
    @Override
    public int compareTo(My2DShape other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();
        
        double difference = thisArea-otherArea;
        if(difference > 0.001){
            return 1;
        }
        else if (difference < -0.001) {
            return -1;
        }
        return 0;
    }

    public static My2DShape max(My2DShape o1, My2DShape o2){
        if(o1.calculateArea() > o2.calculateArea()){
            return o1;
        }else{
            return o2;
        }
    }

    @Override
    public String toString() {
        return "Two-Dimensional Shape: "+ getName() + "\r\n[Color = " + getColor() + "\r\nFilled = " + filled + 
        "\r\nArea = " + calculateArea()+ "\r\nPerimeter = " + calculatePerimeter() + "]";
    }

    

    

    
    



    

    
}
