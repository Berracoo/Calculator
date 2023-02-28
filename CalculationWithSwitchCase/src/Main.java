import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Please pick the first number : ");
        // choosing the number
        int firstNum = input.nextInt();
        System.out.println();
        System.out.print("Please pick the second number : ");
        int secondNum = input.nextInt();
        System.out.println();
        System.out.print("Please select a number between 1-4 : ");
        int select = input.nextInt();
        System.out.println();
        input.close();
        switch(select){
            case 1 :
                System.out.println("Addition result is : " + (firstNum + secondNum));
                break;
            case 2 :
                System.out.println("Deduction result is : " + (firstNum - secondNum));
                break;
            case 3 :
                System.out.println("Division result is : " + (firstNum / secondNum));
                break;
            case 4 :
                System.out.println("Multiplication result is : " + (firstNum * secondNum));
                break;
            default:
        }

    }
}