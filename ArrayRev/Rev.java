package ArrayRev;

public class Rev {
    public static void main(String[] args) {
        int[] arr= {3,8,20,23,2};
        int n = arr.length;
        int temp;
        int i=0;int j=n-1;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;    
            i++;
            j--;
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        } //use foreach for cleaner code 
    }
}
