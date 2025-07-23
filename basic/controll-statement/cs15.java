/*
   DRY :- Don't Repeat Yourself
   KISS :- Keep It Simple & Short
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter + for addition");
      System.out.println("Enter * for mulitplication");
      System.out.println("Enter % for even or odd");
    
      System.out.println("Enter your choice");
      char choice = sc.next().charAt(0);
      int a=0,b=0;
      if(choice == '+' || choice == '*'){
       System.out.println("Enter 2 number");
       a = sc.nextInt();
       b = sc.nextInt();
      }             
      switch(choice){
        case '+': System.out.println("Addition : "+(a+b));
                  break;
        case '*' :System.out.println("Mulitplication : "+(a*b));
                  break;
        case '%': System.out.println("Enter a number");
                  int n = sc.nextInt();
                  String s = n%2==0 ? "Even" : "Odd";
                  System.out.println(s);
                  break;
        default: System.out.println("Invalid Choice");
      }
    }
}













