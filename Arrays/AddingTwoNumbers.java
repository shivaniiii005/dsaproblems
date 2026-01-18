package Arrays;
import java.util.*;

public class AddingTwoNumbers {

    // Method to add two numbers stored in arrays
    static Vector<Integer> addTwoNumbers(int[] arr1, int[] arr2) {
        Vector<Integer> ans = new Vector<>();
        int i = arr1.length - 1;   
        int j = arr2.length - 1;  
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr1[i];
                i--;
            }
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }
            ans.add(sum % 10);   // store last digit
            carry = sum / 10;    // update carry
        }
        Collections.reverse(ans);
        return ans;
    }
    static void printResult(Vector<Integer> result) {
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first number: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter digits of first number:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second number
        System.out.print("Enter size of second number: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter digits of second number:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Add and print
        printResult(addTwoNumbers(arr1, arr2));

        sc.close();
    }
}
