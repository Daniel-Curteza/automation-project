package courses.oop2;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape("black",0);
        s1.setColor("red");
//        System.out.println("The color of the shape is " + s1.getColor());

        Circle c1 = new Circle();
        c1.setVertices(1);
        c1.setRadius(5);
        c1.setColor("green");
//        System.out.println("The color of the circle is " + c1.getColor());
//        c1.printCircle();
        Circle c2 = new Circle("white", 1, 7);
        Circle c3 = new Circle("yellow", 3, 5);
//        System.out.println(c2.getColor());
//        c2.printCircle();
          c2.setColor("pink");
        Utils.printCircleStatic(c2);
        Utils.printCircleStatic(c3);
        Square sq1 = new Square(5);
        sq1.setLength(7);
        System.out.println("sq1 length: " + sq1.getLength());

        Shape r2 = new Rectangle(6,7);
        Shape sq2 = new Square(9);


    }
}
