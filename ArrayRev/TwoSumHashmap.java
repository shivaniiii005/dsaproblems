package ArrayRev;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumHashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        System.out.print("Enter Target value: ");
        int target = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter Elements of Array: ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res= hash(arr, target);
        if(res[0]==-1) System.out.println("No pair found");
        else System.out.println("Pair at indices: " + res[0] + " and " + res[1]);
        sc.close();
    }
    public static int[] hash(int[] arr,int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];
            if(map.containsKey(need)){
                return new int[] {
                    map.get(need), i
                };
            }
            map.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }
}

