package Math;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of Numbers is "+sum(n));
        sc.close();
    }
    public static int sum(int n){
        int s=0;
        while(n>0){
        int last = n%10;
        s = s+last;
        n=n/10;
        }
        return s;
    }
}
