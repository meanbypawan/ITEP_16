// 1 2 3 .....n
import java.util.Scanner; 
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int i=1,sum=0;
      while(i<=n){
       sum = sum + i;
       i++;
      }
      System.out.println("Sum From 1 to "+n+" = "+sum);
    }
}