package Math;
import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        evenorodd(n);
        sc.close();
    }
    public static void evenorodd(int n){
        if(n%2==0) System.out.println("Even Number");
        else System.out.println("odd");
    }
}
