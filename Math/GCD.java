package Math;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gdc(a, b));
        sc.close();
    }
    public static int gdc(int a, int b){
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}
