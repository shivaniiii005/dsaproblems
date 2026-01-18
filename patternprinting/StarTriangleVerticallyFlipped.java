package patternprinting;

import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 1; i <=n ; i++) {
        //     for (int j = 1; j <=n ; j++) {
        //        if((i+j)>n) System.out.print("* ");
        //        else System.out.print("  ");
        //     } 
        //     System.out.println();
        // }sc.close();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) { //Spaces Loop
                System.out.print("  "); //Remove one space from here, it becomes a pyramid😂
            }
            for (int j = 1; j <=i ; j++) { //Stars Loop
                System.out.print("* ");
            }
            System.out.println();
        }sc.close();
    }
}
