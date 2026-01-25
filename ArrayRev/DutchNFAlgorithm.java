package ArrayRev;

public class DutchNFAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,1,0,2,0,1,1,0,2,0,2,0,1};
        segregatemethod(arr);
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    public static void segregatemethod(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            } else{
                swap(arr, mid, high);
                high--;
            }
        }
    }

}
