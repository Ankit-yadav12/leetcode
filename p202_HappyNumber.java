import java.util.HashSet;
import java.util.Scanner;

public class p202_HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> nums = new HashSet<>();
        while (n != 1 && !nums.contains(n)) {
            nums.add(n);
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number!");
        } else {
            System.out.println(num + " is not a Happy Number.");
        }
    }
}
