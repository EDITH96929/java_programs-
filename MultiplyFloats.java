package cutm;

import java.util.Scanner;

public class MultiplyFloats {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating-point number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second floating-point number: ");
        float num2 = sc.nextFloat();
        float result = num1 * num2;
        System.out.println("The result of multiplication is: " + result);
        sc.close();
    }
}
