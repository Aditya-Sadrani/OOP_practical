import java.util.*;

class Employee {
    private String employeeName;
    private int employeeSalary;

    public void readEmployeeData(Scanner sc) {
        System.out.print("Enter employee name : ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary : ");
        employeeSalary = sc.nextInt();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name : " + employeeName);
        System.out.printf("Employee Salary : %d", employeeSalary);
    }
}

public class pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        emp.readEmployeeData(sc);
        emp.displayEmployeeData();

        sc.close();
    }
}
