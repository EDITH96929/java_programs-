package cutm;

public class pattern3 {
    static int rows = 5;
    static int columns = 5;

    public static void main(String[] args) {
        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < columns; j++) {
                if(i == j) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
