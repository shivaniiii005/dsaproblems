package ArrayRev;
import java.util.Scanner;

public class Homogen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }   
        print(arr);
        sc.close();
    }
   public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
}
