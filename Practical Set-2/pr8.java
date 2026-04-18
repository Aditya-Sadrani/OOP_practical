import java.util.*;

class Point {
    double x;
    double y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point coordinates : (" + x + ", " + y + ")");
    }
}

public class pr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        System.out.println("Default Constructor :");
        p1.display();

        System.out.print("\nEnter value of x : ");
        double x = sc.nextDouble();

        System.out.print("Enter value of y : ");
        double y = sc.nextDouble();

        Point p2 = new Point(x, y);
        System.out.println("Parameterized Constructor :");
        p2.display();

        Point p3 = new Point(p2);
        System.out.println("Copy Constructor :");
        p3.display();

        sc.close();
    }
}
