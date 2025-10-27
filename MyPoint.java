
/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: creates a point for all of the shapes
*/
public class MyPoint {
    //variables
    double x,y;


    public MyPoint(double x, double y) { //constructor
        this.x = x;
        this.y = y;
    }

    //getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //methods
    public double distance(MyPoint other){
        double otherX = other.getX();
        double otherY = other.getY();
        
        double distance = Math.sqrt(Math.pow(otherY-y,2) + Math.pow(otherX -x,2));

        return distance;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
}

