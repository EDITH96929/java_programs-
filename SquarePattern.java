package cutm;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of square: ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++)
                System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
