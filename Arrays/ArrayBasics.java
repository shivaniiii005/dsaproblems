package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {15,5,9,39,22};
        //Indexing
        System.out.println(arr[4]);
        //updating elemets: - Mutable
        arr[3] = 10;
        System.out.println(arr[3]);

        // Another way:
        int arr2[] = new int[4];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;
        arr2[3]=40;
        
    }
}
