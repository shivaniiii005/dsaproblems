package Math;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
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
    public static int lcm(int a,int b){
        return (a*b)/gdc(a, b);
    }
}
