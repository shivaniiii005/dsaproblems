package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array, take input from array, target element, logic
        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Target Element is found");
        else System.out.println("Target element doesn't exist in the above array");
        sc.close();
    }
}
