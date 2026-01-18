package loops;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        n = Math.abs(n);   // handle negative numbers

        while (n > 0) {
            int last = n%10; // last digit
            sum = sum+last;
            n = n / 10;   // remove last digit
        }

        System.out.println(sum);
        sc.close();
    }
}
