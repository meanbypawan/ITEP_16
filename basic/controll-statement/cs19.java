// 1 2 3 4 5 6 7 8.......n
// where n is positive integer
import java.util.Scanner;
class TestMain{
    public static void main(String arggs[]){
      int i,n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      n = sc.nextInt();

      if(n > 0){
        i=1;
        while(n!=0){
            System.out.print(i+"\t");
            i++;
            n--;
        }
      }
      else
        System.out.println("Limit is not positive integer");
    }
}