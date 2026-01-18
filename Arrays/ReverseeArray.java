package Arrays;
import java.util.Scanner;
public class ReverseeArray {

    public static void reverse(int[] arr){
        int i=0, j=arr.length-1;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.print("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);

        System.out.print("Reversed Array: ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        sc.close();
    }    
}
