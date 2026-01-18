package Methods;

import java.util.Scanner;

public class Swap {
    // public static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // } // pass by value example
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" a: ");
        int a = sc.nextInt();
        System.out.print(" b: ");
        int b = sc.nextInt();
        //USING TEMP
        // int temp=a;
        // a=b;
        // b=temp; 
        System.out.println("Before swapping: "+ a+" "+b);
        a = a + b;  
        b = a - b;  
        a = a - b;  
        System.out.println("After swapping: "+a+" "+b);
        
        sc.close();
    } 
}
