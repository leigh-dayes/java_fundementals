import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("** Welcome to the Calculator **");
            System.out.println("Please choodse one of the below options");
            System.out.println("1: Integer Arithmetic");
            System.out.println("2: Decimal Arithmetic");
            System.out.println("0: Exit Calculator");
            System.out.println("Your option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Please enter the first integer: ");
                    int a = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Please enter the operator +, -, * or /: ");
                    String o = scanner.nextLine();
                    System.out.print("Please enter the second integer: ");
                    int b = scanner.nextInt();
                    System.out.println("Your result is: " + calculator(a, o, b));
                    System.out.println(" ");
                    break;
            
                case 2:
                    System.out.print("Please enter the first decimal number: ");
                    double c = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Please enter the operator +, -, * or /: ");
                    String p = scanner.nextLine();
                    System.out.print("Please enter the second decimal number: ");
                    double d = scanner.nextDouble();
                    System.out.println("Your result is: " + calculator(c, p, d));
                    System.out.println(" ");
                    break;
                
                case 0:
                    exit = true;
                    System.out.println(" ** Goodbye ** ");
                    break;
            }
        }
        scanner.close();
    }
    // integer calculator
    public static int calculator(int a, String o, int b) {
        if (o.equals("+")) {
            return a + b;
        }
        else if (o.equals("-")) {
            return a - b;
        }
        else if (o.equals("*")) {
            return a * b;
        }
        else if (o.equals("/")) {
            return a / b;
        }
        else { return 0; }
    }
    // double calculator
    public static double calculator(double a, String o, double b) {
        if (o.equals("+")) {
            return a + b;
        }
        else if (o.equals("-")) {
            return a - b;
        }
        else if (o.equals("*")) {
            return a * b;
        }
        else if (o.equals("/")) {
            return a / b;
        }
        else { return 0; }
    }
}