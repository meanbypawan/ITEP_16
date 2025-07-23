
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter an integer number b/w (1 and 5)");
      int n = sc.nextInt();
      // n = 3
      switch(n){
         case 1 : System.out.println("One");break;
         case 2 : System.out.println("Two");break;
         case 3 : System.out.println("Three");break;
         case 4 : System.out.println("Four");break;
         case 5 : System.out.println("Five");break;
         default: System.out.println("Invaid Value...."); 
      }
      System.out.println("Out Of Switch...");
      
    }
}






















