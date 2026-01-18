package Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListsBasics {
    public static void main(String[] args) {
        // int[] arr= new int[3];
        // char[] arr2= new char[3];
        ArrayList<Integer> arr = new ArrayList<>();
        //add for adding the elemment
        arr.add(12);
        arr.add(3);
        // System.out.println(arr.get(0));
         //set for changing the element
        arr.set(1, 30); //arr[1] = 30;
        //get for printing  
        System.out.println(arr.get(1)); 

        System.out.println(arr); //not traversing the array by itself 
        int n = arr.size(); //To get size 
        for (int i = 0; i <n ; i++) { 
            System.out.print(arr.get(i)); //Traversing
        }

        // ArrayList<Integer> arr2 = new  ArrayList<>();
        // arr2.add(10);
        arr.remove(n-1);
        System.out.print(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        
    }
}
