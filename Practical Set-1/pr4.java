import java.util.*;
public class pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter height in inches : ");
        double heightInches = sc.nextDouble();

        if (weightPounds <= 0 || heightInches <= 0) {
            System.out.println("Please enter valid input!");
        } 
        else {
            double weightKg = weightPounds * 0.45359237;
            double heightMeters = heightInches * 0.0254;

            double bmi = weightKg / (heightMeters * heightMeters);

            System.out.printf("Body Mass Index (BMI) : %.2f", bmi);
        }

        sc.close();
    }
}
