package ArrayRev;


public class SecondMax {
    public static void main(String[] args) {
        int[] arr= {9,2,5,38,2,39,23,92,2};
        int max= Integer.MIN_VALUE;
         int smax= Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max ) max= arr[i];
    }
    // for (int i = 0; i < arr.length; i++) {
    //     if(arr[i]<min) min = arr[i];
    // }
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]!=max && arr[i]>smax){
            smax= arr[i];
        }
    }
    System.out.println("Max is: "+ max);
    System.out.println("Smax: "+ smax);
    }
    
}
