package patternprinting;
import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { //Spaces
                System.out.print("  ");
            }
            char ch = (char)('A' + i - 1); 
            for (int j = 1; j <= i; j++) { //Letters
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
