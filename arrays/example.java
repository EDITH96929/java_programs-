package cutm.arrays;

public class example {
    
    public static void main(String[] args) {
        int [] arr = new int [5];

        arr[0] = 12;
        arr[1] = 24;
        arr[2] = 35;
        arr[3] = 65;
        arr[4] = 15;

        for(int i = 0;i<= 5;i++){
           System.out.println("the value of array at index "+ i + "  :" +arr[i]);
        }
    }
}
