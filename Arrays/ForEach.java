package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr={2,3,4,8,3};
    
        // if we do foreach(ele : arr) { ele*=arr sout(ele);} // it doesnt change 
        // so foreach is mostly used to dispaly elements or print elements only...

        for (int i = 0; i < arr.length; i++) {
            arr[i]*=2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}