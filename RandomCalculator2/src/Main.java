import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Applying the scanner class to get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please pick the first number : ");
        // choosing the number
        int firstNum = input.nextInt();
        System.out.println();
        System.out.print("Please pick the second number : ");
        int secondNum = input.nextInt();
        System.out.println();
        input.close();
        // declaring the transactions
        int summation = firstNum + secondNum;
        int deduction = firstNum - secondNum;
        int division = firstNum / secondNum;
        int multiplication = firstNum * secondNum;
        // creating a linked list
        LinkedList<Integer> transaction = new LinkedList<Integer>();
        transaction.add(summation);
        transaction.add(deduction);
        transaction.add(division);
        transaction.add(multiplication);
        // getting the size of the list
        int len = transaction.size();
        // creating a random class so that we can choose lists elements randomly
        // by index
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(len);
       int lastProcess = transaction.get(randomInt);
        System.out.println(lastProcess);
        //this line is to randomly apply the transactions
        //it returns the result directly without telling what
        //transaction it applied.

    }
}