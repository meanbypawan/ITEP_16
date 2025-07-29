/*
  n = 2
  power = 4
  2 * 2 * 2 * 2 = 16
  f = 1
  n = 123 ===> power = 3
  n = 1234===> power = 4
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       int count=0, temp=n;
       while(temp!=0){
         temp = temp/10;
         count++;
       } 
       System.out.println("Number ki length : "+count);
       
       temp = n;
       // 123
       int s = 0,f=1;
       while(temp!=0){
         int r = temp%10;
         f = 1;
         for(int i=1 ; i<=count; i++ ){
            f = f * r;
         }
         s = s + f;
         temp = temp/10;
       }
       if(s == n)
        System.out.println("Armstrong...s : "+s);
       else
        System.out.println("Not Armstrong...s : "+s);  
    }
}










