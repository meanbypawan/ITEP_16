import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       int s = 0,temp=n;
       for(int r ; n!=0 ; ){
         r = n%10;
         
         if(r%2 == 0)
           s = s + r;

         n = n / 10;
       }
       System.out.println("Sum of Digit of "+temp+" is : "+s);
    }
}