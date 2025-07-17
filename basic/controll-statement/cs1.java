/*
  Controll-Statement/Conditional Statement :-
   1. if
   2. if-else
   3. nested-if-else
   4. switch
   5. loop :-
       while, do-while, for
   ------------------------------
   1. if(condition/Boolean_expression)
        statement---1;

    2. if(condition/BooleanExpression){
         statement---1;
         statement---2;     
       }  
    3. if(condition/BooleanExpression)
         statement---1;
       else
         statement---2;      
    4. if(condition/BooleanExpression){
    
       }
       else{
       
       }
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value");
       int n =  sc.nextInt();
       // n  = 15 
       if(n > 10){
         System.out.println("Indore");
         System.out.println("Pune");
       }
    }
}
















