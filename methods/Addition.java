import java.util.Scanner;

public class Addition {
          public int add(){
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter the value of a :");
        int  a = sc.nextInt();
        System.out.println("please enter the value of b ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("the addition value of a and b is : "+ c);
        
        sc.close();
       return c;
      }
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add();
    }
}
