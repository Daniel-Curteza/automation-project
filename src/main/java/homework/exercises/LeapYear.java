package homework.exercises;
import java.util.Scanner;
import java.time.Year;

public class LeapYear {
    public static boolean checkYear(int year) {
        Year y = Year.of(year);
        return y.isLeap();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        int year = input.nextInt();
        if (year < 1900 || year > 2016){
            System.out.println("Please enter a valid year between 1900 and 2016.");
        } else {
            if (checkYear(year)) {
                System.out.println("February of " + year + " has 29 days");
            } else {
                System.out.println("February of " + year + " has 28 days");
            }
        }

    }
}
