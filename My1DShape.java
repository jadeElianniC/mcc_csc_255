
/* 
Author: Jade Cabrera
Created: 9/27/25
Purpose: To create a length, and a method to get the length for any 1D Shape
*/
public abstract class My1DShape extends MyShape implements Comparable<My1DShape>{
    //variables
    MyPoint startPoint,endPoint;

    //constructor
    public My1DShape(MyPoint startPoint, MyPoint endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    //abstract methods
    public abstract double calculateLength();
    
    //methods
    //getters
    public MyPoint getStartPoint(){
        return startPoint;
    }
    public MyPoint getEndPoint(){
        return endPoint;
    }
    //comparing
    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        My1DShape myObj = (My1DShape)obj;
        return this.equals(myObj);
    }

    @Override
    public int compareTo(My1DShape other) {
       double thisLength = this.calculateLength();
       double otherLength = other.calculateLength();
       double difference = thisLength - otherLength;

       if(difference > 0.001){ return 1;}
       else if(difference < -0.001){ return -1;}
       return 0;
    }

    public static My1DShape max(My1DShape o1, My1DShape o2){
        if(o1.calculateLength() > o2.calculateLength()){
            return o1;
        }else{
            return o2;
        }
    }

    @Override
    public String toString() {
    
        return "One-Dimensional Shape: Line \r\nColor: " + getColor() +
                "\r\nStart: " + getStartPoint() +
                "\r\nEnd: " + getEndPoint() +
                "\r\nLength=" + calculateLength();
    }

    

    


}
