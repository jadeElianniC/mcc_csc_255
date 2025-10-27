package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
@SuppressWarnings("Convert2Diamond")


/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: creates a scene and customizes window to allow user to create/modify shape
*/
public class ShapeManager {
    ArrayList<MyShape> shapes;

    
    public ShapeManager(){
        this.shapes = new ArrayList<MyShape>();
    }

    //add + remove methods

    public void addShape(MyShape shape){
        shapes.add(shape);
    }

    public boolean removeShape(int index){
        try {
            shapes.remove(index);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    //display methods

    public void displayAllShapes(){ // displays all shapes in collection
        int number = 1;
        for(MyShape shape: this.shapes){
            if(this.shapes.size()>1){
              System.out.println("1" + shape.getName() + ", ");  
            }else{
                System.out.println("(" + number + ")\n" + shape + "\n");
                number++;
            }
            
        }
    }

    public void displayColors(){ // displays color, and if shape is 2D, also displays if filled, of shapes in collection
        for(MyShape shape: this.shapes){
            if(shape instanceof My2DShape my2DShape){
                System.out.println("A " + shape.getName() + " is " + shape.getColor()  
                + ".\r\n Is Filled: " + my2DShape.isFilled());
            }else if (shape != null){
                System.out.println("A " + shape.getName() + " is " + shape.getColor() + ".\r\n ");
            }
        }
    }

    // sorting methods

    public void sort1DShapesByLength(){ //sort all 1D shapes by length in descending order and displays them
        ArrayList<My1DShape> shapeArray1D = new ArrayList<My1DShape>();
        for(MyShape shape:this.shapes){
            if(shape instanceof My1DShape my1DShape){
                shapeArray1D.add(my1DShape);
            }
        }
        Collections.sort(shapeArray1D);
        for(My1DShape shape:shapeArray1D){
            System.out.println(shape);
        }
    }

    public void sort2DShapeByArea(){ // sort all 2D shapes by area in descending order and displays them
       ArrayList<My2DShape> shapeArray2D = new ArrayList<My2DShape>();
        for(MyShape shape:this.shapes){
            if(shape instanceof My2DShape my2DShape){
                shapeArray2D.add(my2DShape);
            }
        }
        Collections.sort(shapeArray2D);
        for(My2DShape shape:shapeArray2D){
            System.out.println(shape);
        } 
    }


    // maximum methods

    public void findMax1DShape(){ // finds and displays longest 1D shape
        My1DShape max1DShape = new MyLine(new MyPoint(0, 0),new MyPoint(0, 0));
        for(MyShape shape:this.shapes){
            if(shape instanceof My1DShape my1DShape){
                max1DShape = My1DShape.max(max1DShape,my1DShape);
            }
        }
        System.out.println(max1DShape);
    }

    public void findMax2DShape(){ //find and display largest(area) 2D shape
        My2DShape max2DShape = new MyCircle(new MyPoint(0, 0),new MyPoint(0, 0));
        for(MyShape shape:this.shapes){
            if(shape instanceof My2DShape my1DShape){
                max2DShape = My2DShape.max(max2DShape,my1DShape);
            }
        }
        System.out.println(max2DShape);
    }


    //getter methods

    public ArrayList<MyShape> getShapes(){ //return the list of all shapes (1D + 2D) in the collection
        return shapes;
    }

}
