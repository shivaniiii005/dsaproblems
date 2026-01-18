package Arrays;
import java.util.ArrayList;
public class ArrayListRev {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
    arr.add(1);
    arr.add(15);
    arr.add(30);
    System.out.println(arr+" ");
    int i = 0;
    int j = arr.size()-1;
    while(i<j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        i++;
        j--;
        
    }
    System.out.println(arr+" ");
    //For removing: 
    // arr.remove(j-1);
    // System.out.println(arr);
    }
}
//Fr characters: 
