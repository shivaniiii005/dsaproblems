package Arrays;
import java.util.*;

public class AddingOne {

    static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }

        if (carry == 1)
            ans.add(1);

        Collections.reverse(ans);
        return ans;
    }

    public static void printResult(int[] arr) {
        System.out.print("After adding 1: ");
        for (int num : addOne(arr)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Just pass the array
        printResult(arr);

        sc.close();
    }
}
