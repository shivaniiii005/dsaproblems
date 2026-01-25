package ArrayRev;


public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr= {2, -1, 9, 34, 3, 23, -23};
    int max= Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max ) max= arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<min) min = arr[i];
    }

    System.out.println("Max is: " + max);
    System.out.println("Min is "+ min);

    } 
}
