package Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr= {5,10, 23, 24, 57, 77, 82, 91};
        for(int i=0;i<arr.length-1;i=i+2){
            // if(i==arr.length-1) break;
            int temp=arr[i];
            arr[i] =arr[i+1];
            arr[i+1]= temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
