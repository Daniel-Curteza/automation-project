package homework.exercises.library;

import lombok.Getter;
import lombok.Setter;

public class Book {
    @Getter @Setter
    public String name;

    @Getter @Setter
    public int year;

    @Getter @Setter
    public String author;

    @Getter @Setter
    public double price;

    public Book(String name,int year, String author,double price){
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;


    }
}