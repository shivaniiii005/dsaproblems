package ArrayRev;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
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
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) { System.out.print("Element is found at index: "+ i +" and is "+ arr[i]);
            found = true;
            break;
        }
        }
        if(!found) System.out.println("Ele is not found");
        sc.close();
    }
}
