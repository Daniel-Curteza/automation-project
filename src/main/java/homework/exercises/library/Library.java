package homework.exercises.library;

public class Library {
    public static void main(String[] args) {
        Book newBook = new Book();
        newBook.name="The da Vinci Code";
        newBook.year=2003;
        newBook.price=45;
        newBook.author="Dan Brown";
        Author newAuthor = new Author();
        newAuthor.name="Dan Brown";
        newAuthor.email="dan_brown@email.com";
        System.out.println("Book " + newBook.name + "(" + newBook.price + "RON),by " + newAuthor.name + ", published in " + newBook.year);

    }
}
