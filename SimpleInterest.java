package cutm;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
        sc.close();
    }
}
