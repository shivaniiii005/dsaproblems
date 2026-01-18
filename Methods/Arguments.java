package Methods;

public class Arguments {
    // public static void sum(int a,int b){
    //     System.out.println(a+b);
    // }
    public static void max(int a, int b, int c){
        System.out.println(Math.max(Math.max(a,b),c));
    }
    public static void main(String[] args) {
        max(5, 9, 12);
    }
}
