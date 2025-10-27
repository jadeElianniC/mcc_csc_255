package Assignment1;


import java.util.ArrayList;
import java.util.Scanner;


/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: will hold the main method to run the whole program
*/
public class ShapeManagerConsole {
    public static Scanner scanner = new Scanner(System.in);
    public static ShapeManager manager = new ShapeManager();
    public static String userInput;

    public static void main(String[] args) {
        printMenu();
            
        do{
            System.out.println("Enter your choice: ");
            userInput = scanner.nextLine();
            switch(userInput){

                case "1" -> { addLine();
                }
                case "2" -> { addCircle();
                }
                case "3" -> { addRectangle();
                }
                case "4" -> { addSquare();
                }
                case "5" -> { addTriangle();
                }
                case "6" -> { manager.displayAllShapes();
                }
                case "7" -> { manager.displayColors();
                }
                case "8" -> { removeShape();
                }
                case "9" -> { manager.sort1DShapesByLength();
                }
                case "10" -> { manager.sort2DShapeByArea();
                }
                case "11" -> { manager.findMax1DShape();
                }
                case "12" -> { manager.findMax2DShape();
                }
                case "13" -> { editShape();
                }
                case "0" -> { break;
                }
            }
        }while (!"0".equals(userInput));
        manager.displayAllShapes();
    }

    public static void printMenu(){
        System.out.println("""
            ==== Shape Manager Menu ====
            1.  Add Line (1D)
            2.  Add Circle (2D)
            3.  Add Rectangle (2D)
            4.  Add Square (2D)
            5.  Add Triangle (2D)
            6.  Display All Shapes
            7.  Display How to Color
            8.  Remove Shape
            9.  Sort 1D Shapes by Length
            10. Sort 2D Shapes by Area
            11. Find Longest 1D Shape
            12. Find Longest 1D Shape
            13. Edit Shape
            0.  Exit
            ============================
            """);
    }

    
    
    public static void addLine(){
        System.out.println("You are now creating a Line.");
        System.out.println("What is the starting point? [please divide numbers with a space]");
        Double startingX = scanner.nextDouble();
        Double startingY = scanner.nextDouble();
        System.out.println("What is the ending point? [please divide numbers with a space]");
        Double endingX = scanner.nextDouble();
        Double endingY = scanner.nextDouble();
        MyLine userLine = new MyLine(new MyPoint(startingX,startingY),new MyPoint(endingX,endingY));
        manager.addShape(userLine);
    }

    public static void addCircle(){
        System.out.println("""
                           You are now creating a Circle.
                           Would you like to:
                           (1) Enter a center point, and a radius
                           (2) Enter top left and bottom right corner points
                           Enter (1) or (2): 
                           """);
        int userType = scanner.nextInt();
        switch(userType){
            case 1 -> {
                System.out.println("What is the center point?[please divide numbers with a space]");
                Double centerX = scanner.nextDouble();
                Double centerY = scanner.nextDouble();
                System.out.println("What is the radius?");
                Double radius = scanner.nextDouble();
                MyCircle userCircle = new MyCircle(new MyPoint(centerX, centerY), radius);
                manager.addShape(userCircle);
            }
            case 2 ->{
                System.out.println("What is the top left point? [please divide numbers with a space]");
                Double topLeftX = scanner.nextDouble();
                Double topLeftY = scanner.nextDouble();
                System.out.println("What is the bottom right point? [please divide numbers with a space]");
                Double bottomRightX = scanner.nextDouble();
                Double bottomRightY = scanner.nextDouble();
                MyCircle userCircle = new MyCircle(new MyPoint(topLeftX, topLeftY), new MyPoint(bottomRightX,bottomRightY));
                manager.addShape(userCircle);
            }
        }

    }

    public static void addRectangle(){
        System.out.println("""
                           You are now creating a Rectangle.
                           Would you like to:
                           (1) Enter a top left point, a width, and a height
                           (2) Enter top left and bottom right corner points
                           Enter (1) or (2): 
                           """);
        int userType = scanner.nextInt();
        switch(userType){
            case 1 -> {
                System.out.println("What is the top left point?[please divide numbers with a space]");
                Double topLeftX = scanner.nextDouble();
                Double topLeftY = scanner.nextDouble();
                System.out.println("What is the width?");
                Double width = scanner.nextDouble();
                System.out.println("What is the height?");
                Double height = scanner.nextDouble();
                MyRectangle userRectangle = new MyRectangle(new MyPoint(topLeftX,topLeftY), width,height);
                manager.addShape(userRectangle);
                
            }
            case 2 ->{
                System.out.println("What is the top left point? [please divide numbers with a space]");
                Double topLeftX = scanner.nextDouble();
                Double topLeftY = scanner.nextDouble();
                System.out.println("What is the bottom right point? [please divide numbers with a space]");
                Double bottomRightX = scanner.nextDouble();
                Double bottomRightY = scanner.nextDouble();
                MyRectangle userRectangle = new MyRectangle(new MyPoint(topLeftX, topLeftY),new MyPoint(bottomRightX,bottomRightY));
                manager.addShape(userRectangle);
            }
        }
    }

    public static void addSquare(){
        System.out.println("""
                           You are now creating a Square.
                           Would you like to:
                           (1) Enter a top left point, and a side
                           (2) Enter top left and bottom right corner points
                           Enter (1) or (2): 
                           """);
        int userType = scanner.nextInt();
        switch(userType){
            case 1 -> {
                System.out.println("What is the top left point?[please divide numbers with a space]");
                 Double topLeftX = scanner.nextDouble();
                Double topLeftY = scanner.nextDouble();
                System.out.println("What is the side length?");
                Double side = scanner.nextDouble();
                MySquare userSquare = new MySquare(new MyPoint(topLeftX, topLeftY),side);
                manager.addShape(userSquare);
            }
            case 2 ->{
                System.out.println("What is the top left point? [please divide numbers with a space]");
                Double topLeftX = scanner.nextDouble();
                Double topLeftY = scanner.nextDouble();
                System.out.println("What is the bottom right point? [please divide numbers with a space]");
                Double bottomRightX = scanner.nextDouble();
                Double bottomRightY = scanner.nextDouble();
                MySquare userSquare = new MySquare(new MyPoint(topLeftX, topLeftY), new MyPoint(bottomRightX,bottomRightY));
                manager.addShape(userSquare);
            }
    }
    }

    public static void addTriangle(){
        // System.out.println("""
        //                 You are now creating a Triangle.
        //                 Would you like to:
        //                 (1) Enter 3 points
        //                 (2) Enter top left and bottom right corner points
        //                 Enter (1) or (2): 
        //                 """);
        
        // int userType = scanner.nextInt();
        // switch(userType){
        //     case 1 -> {
        //         System.out.println("What is the top left point?[please divide numbers with a space]");
        //          Double topLeftX = scanner.nextDouble();
        //         Double topLeftY = scanner.nextDouble();
        //         System.out.println("What is the side length?");
        //         Double side = scanner.nextDouble();
        //         MySquare userSquare = new MySquare(new MyPoint(topLeftX, topLeftY),side);
        //         manager.addShape(userSquare);
        //     }
        //     case 2 ->{
        //         System.out.println("What is the top left point? [please divide numbers with a space]");
        //         Double topLeftX = scanner.nextDouble();
        //         Double topLeftY = scanner.nextDouble();
        //         System.out.println("What is the bottom right point? [please divide numbers with a space]");
        //         Double bottomRightX = scanner.nextDouble();
        //         Double bottomRightY = scanner.nextDouble();
        //         MySquare userSquare = new MySquare(new MyPoint(topLeftX, topLeftY), new MyPoint(bottomRightX,bottomRightY));
        //         manager.addShape(userSquare);
        //     }
        // }
        System.out.println("""
                        You are now creating a Triangle.
                        Enter the first point (seperated by a space): 
            """);
        Double p1X = scanner.nextDouble();
        Double p1Y = scanner.nextDouble();
        System.out.println("Enter the second point ( seperated by a space): ");
        Double p2X = scanner.nextDouble();
        Double p2Y = scanner.nextDouble();
        System.out.println("Enter the third point ( seperated by a space): ");
        Double p3X = scanner.nextDouble();
        Double p3Y = scanner.nextDouble();
        MyPoint p1 = new MyPoint(p1X,p1Y);
        MyPoint p2 = new MyPoint(p2X,p2Y);
        MyPoint p3 = new MyPoint(p3X,p3Y);
        MyTriangle userTriangle = new MyTriangle(p1, p2, p3);
        manager.addShape(userTriangle);

    }

    public static void removeShape(){
        manager.displayAllShapes();
        System.out.println("Please enter the number of the shape you would like to remove: ");
        int index = scanner.nextInt();
        manager.removeShape(index-1);
        manager.displayAllShapes();
    }

    public static void editShape(){
        ArrayList<MyShape> shapes = manager.getShapes();
        manager.displayAllShapes();
        System.out.println("Please enter the number of the shape you would like to edit: ");
        int index = scanner.nextInt();
        if(shapes.get(index-1) instanceof MyLine){
            System.out.println("Would you like to edit: \n(1) Color\n(2) Starting Point\n(3) Ending Point\n");
            int userEdit = scanner.nextInt();
            switch (userEdit) {
                case 1 ->{
                    //TODO
                }
                case 2->{

                }
                case 3->{
                    
                }
                default ->{
                    throw new IllegalArgumentException();
                }
            }
        }else if( shapes.get(index-1) instanceof MyCircle){

        }else if( shapes.get(index-1) instanceof MyRectangle){
            
        }else if( shapes.get(index-1) instanceof MySquare){
            
        }else if( shapes.get(index-1) instanceof MyTriangle){
            
        }
    }
    

    
}
