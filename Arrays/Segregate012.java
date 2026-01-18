package Arrays;
import java.util.*;

public class Segregate012 {
    static void segregate(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
      
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        segregate(arr);

        System.out.println("After segregation:");
        printArray(arr);

        sc.close();
    }
}
