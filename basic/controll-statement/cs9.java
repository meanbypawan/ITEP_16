import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 4 digit amount");
      int amount = sc.nextInt();
      
      int notes500, notes200, notes100, notes50, notes20, notes10, notes5;
      notes500 = notes200 = notes100 = notes50 = notes20 = notes10 = notes5 = 0;
      // 1279%500
      notes500 = amount/500;

      amount = amount % 500;
      
      notes200 = amount/200;
      amount = amount%200;

      notes100 = amount / 100;
      amount = amount%100;

      notes50 = amount/50;
      amount = amount%50;

      notes20 = amount/20;
      amount = amount%20;

      notes10 = amount/10;
      amount = amount%10;

      notes5 = amount/5;
      amount = amount%5;

      System.out.println("500 notes : "+notes500);
      System.out.println("200 notes : "+notes200);
      System.out.println("100 notes : "+notes100);
      System.out.println("50 notes : "+notes50);
      System.out.println("20 notes : "+notes20);
      System.out.println("10 notes : "+notes10);
      System.out.println("5 notes : "+notes5);
      System.out.println("Remaing coins of : "+amount);
    }
}





