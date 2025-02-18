package cutm;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String binary1 = "1101"; 
        String binary2 = "1011"; 

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;

        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of binary strings: " + binarySum);
    }
}
