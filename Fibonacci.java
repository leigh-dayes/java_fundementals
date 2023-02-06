public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(recursiveFib(n));
    }
    public static int recursiveFib(int n) {
        if (n == 1) { return 1; }
        else if (n == 2) { return 1;}
        else {
            return recursiveFib(n-1) + recursiveFib(n-2);
        }
    }
}