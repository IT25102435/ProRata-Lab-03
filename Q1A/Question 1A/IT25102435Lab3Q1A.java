import java.util.Scanner;

public class IT25102435Lab3Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price, kilos, total;

        System.out.print("Enter price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        kilos = input.nextDouble();

        total = price * kilos;

        System.out.println("Total amount = " + total);

        input.close();
    }
}