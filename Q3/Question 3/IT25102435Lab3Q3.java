import java.util.Scanner;

public class IT25102435Lab3Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount, remainder;

        System.out.print("Enter rupee amount: ");
        amount = input.nextInt();

        remainder = amount;

        System.out.println("5000 Notes - " + (remainder / 5000));
        remainder = remainder % 5000;

        System.out.println("1000 Notes - " + (remainder / 1000));
        remainder = remainder % 1000;

        System.out.println("500 Notes - " + (remainder / 500));
        remainder = remainder % 500;

        System.out.println("200 Notes - " + (remainder / 200));
        remainder = remainder % 200;

        System.out.println("100 Notes - " + (remainder / 100));
        remainder = remainder % 100;

        System.out.println("50 Notes - " + (remainder / 50));
        remainder = remainder % 50;

        System.out.println("20 Notes - " + (remainder / 20));
        remainder = remainder % 20;

        System.out.println("10 Notes - " + (remainder / 10));
        remainder = remainder % 10;

        System.out.println("05 Notes - " + (remainder / 5));
        remainder = remainder % 5;

        System.out.println("02 Coins - " + (remainder / 2));
        remainder = remainder % 2;

        System.out.println("01 Coins - " + remainder);

        input.close();
    }
}