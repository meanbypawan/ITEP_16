
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a letter");
      char ch =  sc.next().charAt(0);
      switch(ch){
        case 'a': System.out.println("Mateched | Vowel");break;
        case 'e': 
        case 'i': 
        case 'o': 
        case 'u': System.out.println("Vowel");break;
        default: System.out.println("Not a vowel");
      }
      System.out.println("Out Of Switch...");
      
    }
}






















