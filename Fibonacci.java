package cutm;

import java.util.Scanner;

public class Fibonacci {
  
    public void print(int lower, int upper) {
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence from " + lower + " to " + upper + ":");

        while (a <= upper) {
            if (a >= lower) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range for Fibonacci sequence: ");
        int lower = sc.nextInt();
        System.out.print("Enter the higher range for Fibonacci sequence: ");
        int upper = sc.nextInt();

        sc.close();

        Fibonacci obj = new Fibonacci();
        
        obj.print(lower, upper);
    }
}