import java.util.Scanner;

public class p263_UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) return false; // Ugly numbers must be positive
        int[] factors = {2, 3, 5};

        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's ugly: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean result = isUgly(number);

        System.out.println("Is " + number + " an ugly number? " + result);
    }
}
