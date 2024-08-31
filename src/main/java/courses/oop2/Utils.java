package courses.oop2;

import homework.exercises.library.Author;
import homework.exercises.library.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    public static void printList(Collection c) {
        for (Object o : c){
            System.out.println(o);
        }

    }

    public static void printMap(Map m){
        for (Object o: m.keySet()){

            System.out.println("KEY " + o +  "  VALUE " +  m.get(o));
        }
    }

    public static HashMap<Character, Integer>countCharsInText(String text){
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c: text.toLowerCase().toCharArray()){
            if (charMap.containsKey(c)){
                charMap.put(c,charMap.get(c) + 1);
            }
            else charMap.put(c,1);
        }
        return charMap;
    }
}
