package patternprinting;
import java.util.Scanner;
public class Pyramidnstnsp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) { //Spaces Loop
                System.out.print("  "); //Remove one space from here, it becomes a pyramid😂
            }
            for (int j = 1; j <=nst ; j++) { //Stars Loop
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }sc.close();
    }
}
