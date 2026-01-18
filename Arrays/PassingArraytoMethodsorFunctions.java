package Arrays;

public class PassingArraytoMethodsorFunctions { //Not Pass by reference but 
    public static void main(String[] args) { // How Java passes the reference value
        int x[] = {1,2,3,4};
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2] = 44;
    }
}
