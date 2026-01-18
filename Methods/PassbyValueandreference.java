package Methods;

public class PassbyValueandreference {
    public static void change(int x){
        x =10; //So, 6 becoems 10 here... that means 6 is stored here and 10 came here but its not printed 
    }
    public static void main(String[] args) {
        int x=6;
        System.out.println(x);
        change(x); // Value of x is passed to a method... So 
        System.out.println(x);
    }
}
