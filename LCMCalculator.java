package cutm;

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM: " + max);
                break;
            }
            max++;
        }
        sc.close();
    }
}
