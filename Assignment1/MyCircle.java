package Assignment1;


/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: creates a circle
*/


public class MyCircle extends My2DShape {
    //formatting decinal variables
    
    //variables
    double radius;
    MyPoint center;


    //constructors
    
    public MyCircle(MyPoint center, double radius){
        // MyPoint topLeft = new MyPoint(center.getX() - radius, center.getY() + radius);
        // MyPoint bottomRight = new MyPoint(center.getX() + radius, center.getY() - radius);

        /*To get the topLeft and bottomRight points (the corners), you have to add and subtract to the center point for each X and Y.
         * topLeft = (center X) - radius , (center Y) + radius
         * bottomRight = (center X) + radius, (center Y) - radius
         */
        super(new MyPoint(center.getX() - radius, center.getY() + radius),new MyPoint(center.getX() + radius, center.getY() - radius));
        this.radius = radius;
        this.center = center;
    }

    public MyCircle(MyPoint topLeft, MyPoint bottomRight){
        super(topLeft, bottomRight);
        /* We get the radius by using the pythagorean theorem to get the hypotenuse which is equal to the diameter
         * and then dividing it by 2 to get the radius.
         */
        //creating the "sides" of the makeshift triangle by adding the two X's of the topLeft and bottomRight points, then doing the same for y
        Double aSide = topLeft.getX() + bottomRight.getX();
        Double bSide = topLeft.getY() + bottomRight.getY();
        //plugging the sides into the pythagorean theorem -> sqrt(aSide^2+bSide^2) and then dividing by 2 to get the radius
        this.radius = ((Math.sqrt(Math.pow(aSide, 2)+Math.pow(bSide, 2)))/2); 

        /* To get the center point you take the radius of the circle and either of the corners, I used the topLeft,
         * and you add or subtract the radius from the corner's x, and y. I added the radius to topLeft's X and 
         * subtracted the radius from topLeft's Y.
         */
        this.center = new MyPoint(topLeft.getX()+radius,topLeft.getY()-radius);

    }
    
    //getters
    public double getDiameter(){
        return 2*radius;
    }

    @Override
    public String getName(){
        return "Circle";
    }

    public double getRadius(){
        return radius;
    }

    public MyPoint getCenter(){
        return center;
    }

    //methods
    @Override
    public double calculateArea(){
        return 3.14*(radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String howToDraw(){
        return "Center: " + getCenter() + ", Radius: " + getRadius();
    }

    public String howToColor(){
        if(this.isFilled() == true){
            return "Fill the circle with the color " + getColor();
        }else{
            return "Outline the circle with the color " + getColor();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" + getCorners() + "\r\n" + howToDraw() + "\r\n" + howToColor();
    }

    

}
