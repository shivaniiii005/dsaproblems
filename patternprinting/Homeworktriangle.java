package patternprinting;
import java.util.Scanner;
public class Homeworktriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1 ; i <=n ; i++) {
            for (int j =1 ; j <=i-1 ; j++) { //Spaces
                System.out.print("  ");
            }
            for (int j = 1; j <=n+1-i ; j++) { //Stars
                System.out.print("* ");
            }
            System.out.println();
        } sc.close();
    }
}
