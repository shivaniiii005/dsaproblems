package ArrayRev;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {6,8,1,2,4,9,0};
        int d = 3;
        int n = arr.length;
        d=d%n;
        // new array = 16 4 3 8 9 2 
        // 2 9 8 3 4 16, 16 4 3 8 9 2
        // 1 2 3 4 , if d=2, 3 4 2 1, if d= 6, 3 4 2 1
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
    public static void reverse(int[] arr,int i, int j){
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
}
        