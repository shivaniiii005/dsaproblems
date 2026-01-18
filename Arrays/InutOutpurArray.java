package Arrays;
import java.util.Scanner;
public class InutOutpurArray {
    public static void main(String[] args) {
        // int[] arr={10,20,30,40,50,60,70,80,90};
        // System.out.println(arr.length);
        // for (int i = 0; i < arr.length; i++ ) {
        //     System.out.print(arr[i]+" ");
        // }
        // int i =0;
        // while(i<=5){
        //     System.out.print(arr[i]+" ");
        //     i++;
        // }
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");  // To tprint double: Sout(2*arr[i]+" ");
        }
        sc.close();
    }
}
