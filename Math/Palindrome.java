package Math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        palindrome(n);
        sc.close();
    }
    public static void palindrome(int n){
        int rev = 0;
        int original = n;
        while(n>0){
            int last =n%10;
            rev = rev * 10 + last;
            n = n/10; 
        }
        if(original==rev) System.out.println("Palindrome"); // with return type boolean: return original == rev;
        else System.out.println("Not a palindrome");
    }
}
