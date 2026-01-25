package ArrayRev;
import java.util.Scanner;
public class Twosum {
    public static void main(String[] args) {

        // int[] arr = {2, 7, 11, 15, 25, 1};
        // int target = 26;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        System.out.print("Enter Target value: ");
        int target = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter Elements of Array: ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target) {
                    System.out.println("Pair is found by elements "+ arr[i] +" "+ arr[j]+" Which are at indices "+i+" "+j);
                found = true;
                break;
                }
            }
            if(found) break;
        }
        if(!found) System.out.println("No pair found");
        sc.close();
    }
}