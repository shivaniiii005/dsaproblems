package Arrays;

public class MereSortedArrays {
    public static void main(String[] args) {
        int[] arr1 ={2,5,6,9,20};
        int[] arr2 = {1,3,4,5,7,8};

        int[] res = new int[arr1.length+arr2.length];
        for(int ele : res) System.out.print(ele+" ");
        System.out.println();

        merge(res,arr1,arr2);

        for(int ele : res) System.out.print(ele+" ");
        System.out.println();
    }

    private static void merge(int[] res, int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i]; //res[k++] = arr1[i++];
                i++;
                // k++;
            }else{
                res[k]= arr2[j]; //res[k++] = arr2[i++];
                j++;
                // k++;
            }
            k++;
        }
        if(i==arr1.length){  
            while(j<arr2.length){
                res[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(j==arr2.length){  
            while(i<arr1.length){
                res[k]=arr1[i];
                i++;
                k++;
            }
        }

    }
}
