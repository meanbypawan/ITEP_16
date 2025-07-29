/*
   Large Amount Of Data :-

   Array :- It is collection of homogenous type of data.
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter total number of element to be inserted..");
      n = sc.nextInt();
      int arr[] = new int[n];
      
      for(int i=0; i<n; i++){
        System.out.println("Enter "+(i+1)+" element");
        arr[i] =  sc.nextInt();
      }
      System.out.println("Given Data ");
      for(int i=0; i<n; i++){
        System.out.println(arr[i]);
      }
    }
}









