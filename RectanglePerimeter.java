package cutm;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        int length = sc.nextInt(), width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
        sc.close();
    }
}
