import java.util.Scanner;
/*
   n > 0  ----> +ve
   n < 0 -----> -ve
   n==0     --> Neutral
 */
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value");
       int n =  sc.nextInt();
       
       if(n > 0)
         System.out.println("+ve");
       else{
         if(n < 0)
           System.out.println("-ve");
         else
           System.out.println("Neither +ve nor -ve");
       }  
    }
}
















