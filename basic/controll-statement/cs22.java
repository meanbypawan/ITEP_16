//1 - 2 + 3 - 4 + 5 - 6 ....n 
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int dataSequence = 1,sum=0;
      while(dataSequence <= n){
        if(dataSequence%2 == 0){
          sum = sum - dataSequence;
        }   
        else{
          sum = sum + dataSequence;
        }   // sum = 3 , dataSequence = 6
        dataSequence++;
      } 
      System.out.println("Sum : "+sum);
    }
}