package ArrayRev;

public class Secondmin {
    public static void main(String[] args) {
        int[] arr= {9,2,5,38,2,39,23,92};
        int min= Integer.MAX_VALUE;
        int smin= Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=min && arr[i]<smin){
                smin=arr[i];
            }
        }
        System.out.println("Min is: "+min);
        System.out.println("SMin is: "+ smin);
    }
}
