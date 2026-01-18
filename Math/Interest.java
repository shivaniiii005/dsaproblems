package Math;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        // Simple Interest
        double si = (p * r * t) / 100;

        // Compound Interest
        double ci = p * Math.pow((1 + r / 100), t) - p;

        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);

        sc.close();
    }
}
