/*
  byte , short, int , long

        No typecasing is required
  ---------------------------------->
  byte---short---int---long
   1       2      4     8  
  <---------------------------------- 
       Typecasing is required

  b + b = i
  b + s = i
  s + s = i
  b + i = i
  s + i = i
  i + i = i
  b + L = L
  s + L = L
  i + L = L
  L + L = L     
 */
class Test{
    public static void main(String args[]){
        int x = 1L;
        System.out.println(x);
        /*
        long x = 2147483648L;
        System.out.println(x);
        */
        /*
        int x = 2147483647;
        x = x + 1;
        System.out.println(x);
        */
    }
}