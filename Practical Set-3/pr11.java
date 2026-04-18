import java.util.*;

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        void readStudentData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name : ");
            studentName = sc.nextLine();

            System.out.print("Enter course : ");
            course = sc.nextLine();

            sc.close();
        }

        void displayAdmissionDetails() {
            System.out.println("\nAdmission Details");
            System.out.println("College Name : " + collegeName);
            System.out.println("Student Name : " + studentName);
            System.out.println("Course Enrolled : " + course);
        }
    }
}

public class pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter college name : ");
        String name = sc.nextLine();

        College c = new College(name);

        College.Admission a = c.new Admission();

        a.readStudentData();
        a.displayAdmissionDetails();

        sc.close();
    }
}
