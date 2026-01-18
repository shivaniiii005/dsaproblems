package Oops;

public class Encaps {
    public static void main(String[] args) {
        BA b = new BA();
        b.deposit(1000);
        System.out.println(b.getBalance());
    }
    public static class BA{
        private int bal =1000;
        
        public void deposit(int amt){
            bal+=amt;
        }
        public int getBalance() {
        return bal;
    }
    }
}
