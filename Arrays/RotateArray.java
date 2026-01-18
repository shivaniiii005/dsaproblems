package Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr= new int[n];
        
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter d: ");
        int d = sc.nextInt(); // no.of rotations
        d=d%n;
        int temp;
        int i = 0, j = d - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;    
            j--;
        }

        i = d;
        j = n - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = 0;
        j = n - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Array after left rotation:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
