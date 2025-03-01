package cutm;

import java.util.Scanner;

public class Fibonacci {
  
    public void print(int range) {
        int a = 0, b = 1;
        System.out.println("fibonacci seieds range upto "+ range + " :");

        while (a <= range) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range for Fibonacci sequence: ");
        int range = sc.nextInt();
        sc.close();

        Fibonacci Obj = new Fibonacci();
        Obj.print(range);
    }
}