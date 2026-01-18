package Math;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fctorial of " + n +" is "+ fact(n));
        sc.close();
    }
    public static int fact(int x){
     int f=1;
     for (int i = 1; i <=x ; i++) {
        f*=i;
     }
      if(x==0) return 1;
      else return f;
    }
}
