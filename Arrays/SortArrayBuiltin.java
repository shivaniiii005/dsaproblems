package Arrays;
import java.util.Arrays;
public class SortArrayBuiltin {
    public static void main(String[] args) {
        int[] arr={10,20,44,33,2,200,3};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
