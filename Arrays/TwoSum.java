package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array, take input from array, target element, logic
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        boolean found = false; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){ System.out.print("Elements are at the indices of "+i +" "+j);
                found = true;
                break;
            }
        }
        if (found) break;
    }
        if(!found) System.out.println("No such pair exists");
        sc.close();
    }
}
