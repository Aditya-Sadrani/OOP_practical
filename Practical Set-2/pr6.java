import java.util.*;

class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class pr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width : ");
        double width = sc.nextDouble();

        System.out.print("Enter height : ");
        double height = sc.nextDouble();

        if (width <= 0 || height <= 0) {
            System.out.println("Please enter valid input!");
        }
        else {
            Rectangle r = new Rectangle(width, height);
            System.out.printf("Area of rectangle : %.2f\n", r.getArea());
            System.out.printf("Perimeter of rectangle : %.2f", r.getPerimeter());
        }

        sc.close();
    }
}
