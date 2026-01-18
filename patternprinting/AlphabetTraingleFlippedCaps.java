package patternprinting;
import java.util.Scanner;
public class AlphabetTraingleFlippedCaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            char ch = (char)('A'+i-1);
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(ch+ " ");
            } 
            System.out.println();
            
        }sc.close();
    }
}
