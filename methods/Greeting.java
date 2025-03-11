import java.util.Scanner;

 public class Greeting {
      public void Greet(){
         Scanner sc = new Scanner (System.in);
         System.out.println("please enter your name");
         String name = sc.nextLine();
         System.out.println("hlo"+ " "+name);
         sc.close();
     }

     public static void main(String[] args) {
         Greeting obj = new Greeting();
         obj.Greet();
     }

}