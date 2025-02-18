package cutm;

import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (n x n): ");
        int n = sc.nextInt();
        int[][] spiral = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1, num = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++)
                spiral[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++)
                spiral[i][right] = num++;
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    spiral[bottom][i] = num++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    spiral[i][left] = num++;
                left++;
            }
        }

        for (int[] row : spiral) {
            for (int val : row)
                System.out.printf("%3d", val);
            System.out.println();
        }
        sc.close();
    }
}
