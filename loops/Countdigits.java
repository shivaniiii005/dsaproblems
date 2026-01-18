package loops;

import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0) n=9;
        int count =0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
