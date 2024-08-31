package homework.exercises;

public class Calculator_corrected {
    public static void main(String[] args){
        if (args.length == 3){
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
            float result = switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> 0;
            };
            System.out.println("Result is " + result);
        } else System.err.println("3 args are needed!");

    }
}