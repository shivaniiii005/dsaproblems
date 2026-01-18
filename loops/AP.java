package loops;
import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= 3*n-1; i=i+3) {
            System.out.print(i+" ");
        }
        sc.close();
        //int a = 2, d =3;
        // for(int i=1 to n){
        // sout(a+" ")
        // }
        // a+=d; //a=a+d;
    }
}
