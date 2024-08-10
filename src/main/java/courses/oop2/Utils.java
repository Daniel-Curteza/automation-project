package courses.oop2;

import homework.exercises.library.Author;
import homework.exercises.library.Book;

public class Utils {
    //    Static
    public static void printCircleStatic(Circle c){
        System.out.println("Color: " + c.getColor());
        System.out.println("Vertices " + c.getVertices());
        System.out.println("Radius " + c.getRadius());
        System.out.println("--------------------------------");
    }
    public static void printLibrary(Author a, Book b){
        System.out.println("Book: " + b.getName() + "(" + b.getPrice() + "RON), by " + a.getName() + ", published in " + b.getYear());
    }
}
