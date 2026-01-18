package Arrays;
import java.util.Scanner;
public class RotateeArray {
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
        int d = sc.nextInt(); // no.of rotation
        d=d%n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        System.out.println("Array after rotation:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
    }
}
