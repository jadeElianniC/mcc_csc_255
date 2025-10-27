
/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: an interface to apply to all shapes
*/
public abstract class MyShape {
    public String color;

    public abstract String getName();

    
    public MyShape(){
        this.color = "black";
    }

    public MyShape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "This shape's color is " + color + "\r\n";
    }

    
}
