package Arrays;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE; //arr[0] 
        int smax = Integer.MIN_VALUE; //arr[0]
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("Maximum of elements: "+ max);
        System.out.println("Second maximum: " + smax);
        sc.close();
    }
}
