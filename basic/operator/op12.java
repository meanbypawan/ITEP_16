import java.util.Scanner;
/*
   class Scanner{
     public int nextInt(){
     }
   }
   Scanner sc = new Scanner();
   sc.nextInt();
 */
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);  
       
       System.out.println("Enter 1st value");
       byte a = sc.nextByte(); // -128 to 127

       System.out.println("Enter 2nd value");
       byte b = sc.nextByte();
    
       byte result = (byte)(a + b);
       System.out.println("Addition : "+result);
    }
}