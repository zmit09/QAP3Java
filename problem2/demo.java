package problem2;

public class demo {
    public static void main(String[] args) {
        Shape s = new Shape("Red", true);
        System.out.println(s.toString());

        Circle c = new Circle(5.0);
        System.out.println(c.toString());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());

        Circle c1 = new Circle(5.0, "blue", true);
        System.out.println(c1.toString());
        System.out.println("Circle Area: " + c1.getArea());
        System.out.println("Circle Perimeter: " + c1.getPerimeter());

        Rectangle r = new Rectangle(2.0, 3.0);
        System.out.println(r.toString());
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());

        Rectangle r1 = new Rectangle(2.0, 3.0, "green", false);
        System.out.println(r1.toString());
        System.out.println("Rectangle Area: " + r1.getArea());
        System.out.println("Rectangle Perimeter: " + r1.getPerimeter());

        Square sq = new Square(4.0);
        System.out.println(sq.toString());
        System.out.println("Square Area: " + sq.getArea());
        System.out.println("Square Perimeter: " + sq.getPerimeter());

        Square sq1 = new Square(4.0, "yellow", true);
        System.out.println(sq1.toString());
        System.out.println("Square Area: " + sq1.getArea());
        System.out.println("Square Perimeter: " + sq1.getPerimeter());
    }
}
