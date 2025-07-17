
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter 1st value");
       int a = sc.nextInt();
    
       System.out.println("Enter 2nd value");
       int b = sc.nextInt();

       System.out.println("Enter 3rd value");
       int c = sc.nextInt();

       int max = (a > b && a > c) ? a : (b > c) ? b : c;
       System.out.println(max+" is greater..");
    }
}
