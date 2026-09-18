import java.util.Scanner;

public class IT25102435Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price, kilos;
        double total, discount, amount;

        System.out.print("Enter price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        kilos = input.nextDouble();

        total = price * kilos;

        discount = total * 10 / 100;

        amount = total - discount;

        System.out.println("Total amount = " + total);
        System.out.println("Discount = " + discount);
        System.out.println("Amount to pay = " + amount);

        input.close();
    }
}