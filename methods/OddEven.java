import java.util.Scanner;

public class OddEven {

    public static int check (){
    
         Scanner sc = new Scanner(System.in);
             System.out.println("please enter a number to check odd or even : ");
            int num = sc.nextInt();
            if ((num % 2 ) == 0) {
                System.out.println("entered number is even ");
            }else if (num == 0){
                System.out.println("zero is a neutral number");
            }else{
                System.out.println("entered number is even");
            }
         sc.close();
    
         return num;
        }
        public static void main(String[] args) {
            check();
    }
}
