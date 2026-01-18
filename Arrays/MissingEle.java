package Arrays;

import java.util.Scanner;

public class MissingEle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=(n + 1)*(n + 2)/2; // if we are taking input then formual is  n(n*1)/2;
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i]; 
        }
        int missing = sum - arraySum;
        System.out.println("Missing element is: " + missing);
        sc.close();
    }   
}
