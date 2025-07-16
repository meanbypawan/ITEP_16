/*
   Syntax :-

   (condition/Boolean Expression) ? exp-2 : exp-3 ;


   Boolean Expression:-
    1. true
    2. false
    3. Relational Expression (a>b)
    4. Logical Expression
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a value");
      int n = sc.nextInt();
      String s = n%2 == 0 ? "EVEN" : "ODD";    
      System.out.println(s);
    }
}












