package Arrays;
import java.util.Arrays;
public class ShallowcopyDeepcopy {
    public static void main(String[] args) {
        //Shallow Copy
        // int[] arr= {10,20,30};
        // System.out.println(arr[2]);
        // int[] x= arr;
        // x[2]= 40;
        // System.out.println(arr[2]);
        
        //Deep copy:  //Diff memory locations... 
        int[] arr={10,20,30,40};
        int[] y= Arrays.copyOf(arr, arr.length);
        y[0]=60;
        System.out.println(y[0]);
        System.out.println(arr[0]); //Changes in y do not affect arr
    }
}
