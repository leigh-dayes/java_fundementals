import java.util.Scanner;

public class DiamondPrinter {
    public static void main(String[] args) {
        System.out.println("what is the height of your diamond?: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int x = 1; x <= height; x++) {
            if (x <= height/2) {
                for (int y = 1; y <= height - x; y++) {
                    System.out.print(" ");
                }
                for (int z = 1; z <= x * 2 - 1; z++) {
                    System.out.print("*");
                }
            }
            else {
                for (int a = height + x; a > height; a--) {
                    System.out.print(" ");
                }
                for (int b = 1; b <= 2 * height - x * 2 - 1; b++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}