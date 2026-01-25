package ArrayRev;
import java.util.Scanner;
public class Homogenousarray {
    public static void main(String[] args) {
        //Homogenous = same type of array
        //All arrays are homogeneous because Java is a strongly typed language.
        //java deosnt support non homogenous arrays.

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        sc.close();
    }
}
