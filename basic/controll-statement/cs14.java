
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter city Either Indore or Pune");
      String city = sc.next();
      switch(city){
        case "Indore" : System.out.println("MP");break;
        case "Pune" : System.out.println("MH");break;
        default: System.out.println("Invalid City");
      }
    }
}






















