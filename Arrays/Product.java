package Arrays;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int prod =1;
        int[] arr= new int[n];
        System.out.print("Elements are: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }
        System.out.println("Product of the elements: "+ prod);
        sc.close();
    }
}
