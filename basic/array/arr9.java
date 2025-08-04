/*
   00 01 02
   10 11 12
   20 21 22
 */
class TestMain{
    public static void main(String args[]){
       int arr[][] = { 
         {10, 20, 30},
         {40, 50 ,60,90,43,45},
         {70, 80}
       };
       
       for(int row[] : arr){
          for(int element : row){
            System.out.print(" "+element);
          }
          System.out.println();
       }
    }
}