package Math;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapyear(int n){
        return (n % 400 == 0) || (n % 4 == 0 && n % 100 != 0);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if(isLeapyear(n)) System.out.println("yes");
        else System.out.println("No");
        sc.close();
    }
}
