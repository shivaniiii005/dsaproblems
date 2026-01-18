package Math;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Reverse of a number is: "+ rev(n));
        sc.close();
    }
    public static int rev(int n){
        int rev=0;
        while(n>0){
            int last = n%10;
        rev = rev*10 + last ;
        n= n/10;
        }
        return rev;
    }
}
