import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Addition,deduction,division,multiplication
        // numbers will be given by users
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.print("Please enter the first number : ");
        double numberOne = scanner.nextInt();
        System.out.print("Please enter the second number : ");
        double numberTwo = scanner.nextInt();
        System.out.println("*******************************");
        Random random = new Random();
        // chooses a number between 0(included) and 4(excluded)
        int randomNumber = random.nextInt(0,4);
        if (randomNumber == 0) {
            System.out.println("Addition result : " + (int) (numberOne + numberTwo));
        }
        if (randomNumber == 1) {
            System.out.println("Deduction result : " + (int) (numberOne - numberTwo));
        }
        if (randomNumber == 2) {
            System.out.println("Multiplication result : " + (int) (numberOne * numberTwo));
        }
        if (randomNumber == 3) {
            System.out.println("Division result : " + (int) (numberOne / numberTwo));
        }
    }
}