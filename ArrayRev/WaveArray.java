package ArrayRev;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr={2,6,8,3,29,2};
        //new array= {6,2,3,8,2,29};
        //swap;
        for (int i = 0; i < arr.length-1; i=i+2) {
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1]= temp;
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
