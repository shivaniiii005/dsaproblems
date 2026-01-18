package Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int temp;
        int i=0, j=n-1; //Take whatever index is needed to be taken here... 
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        sc.close();
    }
}
