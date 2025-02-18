package cutm;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("Compound Interest: " + ci);
        sc.close();
    }
}
