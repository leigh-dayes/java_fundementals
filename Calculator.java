import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator \nPlease enter the first number: ");
        int firstNum = scanner.nextInt();
        // consume \n character
        scanner.nextLine();
        System.out.println("Please enter the operator: ");
        String operator = scanner.nextLine();
        System.out.println("Please enter the second number: ");
        int secondNum = scanner.nextInt();
        int result;
        if (operator.equals("-")) {
            result = firstNum - secondNum;
        }
        else if (operator.equals("+")) {
            result = firstNum + secondNum;
        }
        else if (operator.equals("*")) {
            result = firstNum * secondNum;
        }
        else {
            result = firstNum / secondNum;
        }
        System.out.println("The answer is: " + result);
    }    
}