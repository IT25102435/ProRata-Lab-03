import java.util.Scanner;

public class IT25102435Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary, otHours, otRate;
        double otAmount, totalSalary;

        System.out.print("Enter monthly salary: ");
        salary = input.nextDouble();

        System.out.print("Enter OT hours: ");
        otHours = input.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        otRate = input.nextDouble();

        otAmount = otHours * otRate;

        totalSalary = salary + otAmount;

        System.out.println("OT Amount = " + otAmount);
        System.out.println("Total Salary = " + totalSalary);

        input.close();
    }
}