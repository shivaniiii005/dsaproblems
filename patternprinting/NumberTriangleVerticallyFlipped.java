package patternprinting;

import java.util.Scanner;

public class NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) { //Spaces Loop
                System.out.print("  "); 
            }
            for (int j = 1; j <=i ; j++) { //Stars Loop
                System.out.print(j+" ");
            }
            System.out.println();
        }sc.close();
    }
}
