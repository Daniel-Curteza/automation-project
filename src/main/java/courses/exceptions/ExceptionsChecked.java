package courses.exceptions;

public class ExceptionsChecked {
    public static void main(String[] args) {
        try {
            double radius = Double.parseDouble(args[0]);
            System.out.println(Areas.getCircleArea(radius));

            double side = Double.parseDouble(args[0]);
            System.out.println("Aria patratului este:" + Areas.getSquareArea(side));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please provide a radius value as runtime argument");
        }catch (NumberFormatException e){
            System.out.println("Please provide a valid number as radius value, error found:" + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Error unchecked exception" + e.getMessage());
        }
        finally {
            //it is always run
            System.out.println("Cleanup:Close browser at end");
        }

    }

}
