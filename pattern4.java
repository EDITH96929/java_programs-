package cutm;

public class pattern4 {
    static int rows = 4 ;
    static int columns = 7;
        public static void main(String[] args) {
           for(int i = 1; i<= rows; i++){
               for(int j = 1 ; j <= rows -1; j++){
                     System.out.print(" ");
               }
               for( int j = 1; j <= 2*i -1 ;j++){
                     System.out.print("*");
               }
           System.out.println();  
       }
    }
}
