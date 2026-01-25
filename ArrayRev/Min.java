package ArrayRev;
public class Min {
    public static void main(String[] args) {
        int[] arr= {2,-1,99,34,3,23,-23};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min = arr[i];
        }
        System.out.println("Min element is "+min);
    }
}
