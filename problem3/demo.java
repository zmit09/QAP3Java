package problem3;

public class demo {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.7f);
        System.out.println("Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1.1f, 2.2f, 0.5f, 0.7f);
        System.out.println("Movable Point: " + movablePoint);

        MovablePoint newMovablePoint = movablePoint.move();
        System.out.println("New Movable Point: " + newMovablePoint);
    }
}
