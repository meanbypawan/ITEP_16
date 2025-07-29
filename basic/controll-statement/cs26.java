/*
  n = 2
  power = 4
  2 * 2 * 2 * 2 = 16
  f = 1
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       System.out.println("Enter power..");
       int power = sc.nextInt();
       int f;
       
       for(f=1; power!=0; power--)
         f = f * n;

       System.out.println(f);  
    }
}