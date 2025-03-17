package cutm.arrays;

public class TwodArrays {
   public static void main(String[] args) {
    int [][] matrix = {
      { 1 , 2 , 3 },
      { 13, 6 , 33 },
      { 5, 24 , 43 }
    };
     
      System.out.println(" the length of the matrix is : " + matrix.length);

      for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0;j< matrix[i].length;j++){
           System.out.print( matrix[i][j] +" ");
        }
        System.out.println();
      }
   }
}
