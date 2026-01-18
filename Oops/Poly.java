package Oops;

public class Poly {
    public static class Animal{
        void sound(){
            System.out.println("Animal makes sound");
        }
    }
    public static class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }

}
