package courses.exceptions;

public class Areas {
    public static double getCircleArea(double radius) throws  IllegalArgumentException{
        //if(radius<0)
            //throw
        return Math.PI * radius * radius;
    }

    public static double getSquareArea(double side){
        return side * side;
    }
}
