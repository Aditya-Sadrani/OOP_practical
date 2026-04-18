import java.util.*;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double calculateArea() {
        return d1 * d2;
    }
}

public class pr13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        System.out.print("Enter base of triangle : ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle : ");
        double height = sc.nextDouble();

        t.getData(base, height);
        System.out.printf("Area of triangle : %.2f\n", t.calculateArea());

        Rectangle r = new Rectangle();
        System.out.print("\nEnter length of rectangle : ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle : ");
        double width = sc.nextDouble();

        r.getData(length, width);
        System.out.printf("Area of rectangle : %.2f", r.calculateArea());

        sc.close();
    }
}
