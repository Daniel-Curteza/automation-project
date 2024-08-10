package homework.exercises.library;

import courses.oop2.Utils;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("The da Vinci Code",2003,"Dan Brown",45);
        Author a1 = new Author("Dan Brown","dan_brown@email.com");
        Utils.printLibrary(a1,b1);
    }
}
