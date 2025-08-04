/*
   00 01 02
   10 11 12
   20 21 22
 */
class TestMain{
    public static void main(String args[]){
       int arr[][] = { 
         {10, 20, 30}, // 0
         {40, 50 ,60,65,89}, // 1
         {70, 80}  // 2
       };

       for(int r=0; r<arr.length; r++){
          for(int c=0; c<arr[r].length;c++){
              System.out.print(" "+arr[r][c]);
          }
          System.out.println();
       }
    }
}