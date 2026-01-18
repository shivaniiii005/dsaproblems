package Oops;

public class Inheritance {
    public static class veh{
        void start(){
            System.out.println("Vehicle starts");
        }
    }
    public static class Car extends veh{
        void playmusic(){
            System.out.println("Car plays music ");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.playmusic();
    }
}
//Multilevel: 
