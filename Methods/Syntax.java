package Methods;

public class Syntax {
    
    // public static void Shivani(){
    //     System.out.println("Hi...");

    //     for (int i = 0; i <=10 ; i++) {
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // } 
    public static void main(String[] args) {
        // Shivani();
        // System.out.println("Called from main method");
        // Nikhila();
        A();
    }
//     public static void Nikhila(){
//         System.out.println("Hello...");
// }
public static void A(){
B();
}
public static void B(){
System.out.println("World");
C();
}
public static void C(){
System.out.println("Hello");
}
}
