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

       int d = a > b ? a : b;
       int max = d > c ? d : c;
       System.out.println(max+" is greater");
    }
}
