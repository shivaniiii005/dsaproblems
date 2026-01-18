package Math;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(arms(n)) System.out.println("yes");
        else System.out.println("No");
        sc.close();
    }
    public static boolean arms(int n){
        int original = n;
        int temp = n;
        int digits =0;
        int sum = 0;

        //calc digits: if 153, digit count as 3
        while(temp>0){
            digits++;
            temp = temp/10;
        }
        temp = n;
        while(temp>0){
            int last= temp%10;
            sum = sum + (int)Math.pow(last, digits);
            temp = temp/10;
        }
        return sum == original;
    }
}
