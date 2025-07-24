// 1 4 9 16 25 ...n
/*
   i=1
   1^2 = 1
   2^2 = 4
   3^2 = 9
 */
class TestMain{
    public static void main(String args[]){
      java.util.Scanner sc = new java.util.Scanner(System.in); 
      System.out.println("Enter n");
      int n = sc.nextInt();
      int i=1;
      while(n!=0){
        System.out.print((i*i)+"\t");
        i++; 
        n--;
      }
      System.out.println();
    }
}