package Assignment1;

/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: creates a line
*/
public class MyLine extends My1DShape {

    public MyLine(MyPoint start, MyPoint end){
        super(start,end);
    }

    //methods
    @Override
    public String getName(){
        return "Line";
    }
    
    public String howToColor(){
        return "Color the line as" + getColor();
    }

    @Override
    public double calculateLength() {
        return Math.sqrt(Math.pow(startPoint.getX()-endPoint.getX(),2)+(Math.pow(startPoint.getY()-endPoint.getY(), 2)));
    }
    
    


    
}
