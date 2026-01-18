package loops;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        int temp = Math.abs(n);   // handle negative numbers

        while (temp > 0) {
            int lastdigit = temp % 10;
            rev = rev * 10 + lastdigit;
            temp = temp / 10;
        }

        // restore sign if number was negative
        if (n < 0) {
            rev = -rev;
        }

        System.out.println(rev);
        sc.close();
    }
}
