package Methods;

public class ReturnType {
    public static int A(int a){
        System.out.println("Hi");
        if(a>0) return 5;//Some Integer should be returned 
        else return 10;
        //Returns can be multiple, If else statements
        // After Return, Its finisehd, cannot write sout statements... or sout statements wont be printed 
    }
    public static void main(String[] args) {
        // A(); 5 wont be printed
        // System.out.println(A());
        // if printed or stored then 5 is printed..
        int x = A(7);
        System.out.println(3+x);
        
    }
}
