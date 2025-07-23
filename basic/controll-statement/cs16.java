/*
   DRY :- Don't Repeat Yourself
   KISS :- Keep It Simple & Short
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = scan.nextInt();

      switch(n%2){
        case 0: System.out.println("EVEN");break;
        default: System.out.println("ODD");
      }
    }
}













