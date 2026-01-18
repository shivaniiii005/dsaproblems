package Arrays;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {      // odd index
                arr[i] *= 2;
            } else {               // even index
                arr[i] += 10;
            }
        }
        print(arr);
        sc.close();
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
