/*
     20 + 10 --------> Compile time operation ---> 30
     ----------
     int a=20,b=10;
     a + b   -------> Runtime operation
 */
class TestMain{
    public static void main(String args[]){
      char x;
      char ch1 = 'A';
      char ch2 = 'B';
      x = (char)(ch1 + ch2); 
      System.out.println(x);
    }
}