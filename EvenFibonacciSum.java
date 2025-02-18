package cutm;

import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt(), a = 0, b = 1, sum = 0;
        while (a <= n) {
            if (a % 2 == 0)
                sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Even sum of Fibonacci series: " + sum);
        sc.close();
    }
}
