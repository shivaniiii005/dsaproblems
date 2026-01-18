package patternprinting;
import java.util.Scanner;
public class StarTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int a=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            } 
            System.out.println();
            
        }sc.close();
    }
}
