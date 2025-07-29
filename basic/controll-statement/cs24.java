/*
   n ;----Factorial
      ----Prime
      ----Reverse
      ----Palindrome
      ----Armstrong
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       int s = 0,temp=n;
       for(int r ; n!=0 ; ){
         r = n%10;
         s = s * 10 + r;
         n = n / 10;
       }
       if(temp == s){
          System.out.println("Given Number is palindrome");
       }
       else
         System.out.println("Not palindrome");
    }
}