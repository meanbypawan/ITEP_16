/*
   10 20 30
   40 50 60
   70 80 90
   -----------
   00 01 02
   10 11 12
   20 21 22

 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the order of matrix");
      int m = sc.nextInt();
      int n = sc.nextInt();

      int arr[][] = new int[m][n];

      for(int r=0; r<m; r++){
        System.out.println("Enter "+n+" element of "+(r+1)+" row");
        for(int c=0; c<n; c++){
            arr[r][c] = sc.nextInt();
        }
      }
      System.out.println("Given Matrix is...");
      for(int r=0; r<m; r++){
        for(int c=0; c<n; c++){
            System.out.print(" "+arr[r][c]);
        }
        System.out.println();
      }
    }
}


























