package cutm;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int num = low; num <= high; num++) {
            int sum = 0, temp = num, digits = (int) Math.log10(num) + 1;
            while (temp > 0) {
                sum += Math.pow(temp % 10, digits);
                temp /= 10;
            }
            if (sum == num)
                System.out.print(num + " ");
        }
        sc.close();
    }
}
