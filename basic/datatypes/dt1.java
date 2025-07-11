/*
   Peform the addition of 2 number
   20 and 10

   integer -- 20,10 -34
   floating-point :-- 0.5, -2.5
   String ----> "hello", "hi", "3213123"
   boolean ----> true,false
   char -------> 'A' , '$', '3'
   
   datatype variable;
   int a;
   float b;
   char c;
   boolean x;
   -----------------------
   Datatypes
    1. Primitive :-
       byte
       short
       int
       long
       float
       double
       char
       boolean

       byte,short,int,long -----> Integer data
       flota,double-------------> Floaing point
       char---------------------> letter
       boolean------------------> true,false
    2. Non-primitive
    int x;
    x = 20.5; // 20
 */
class Test{
    public static void main(String args[]){
       byte a; // 1-byte --8-bit, -128 to + 127   
       byte b;
       byte c;
       a = 20;
       b = 10;
       c = (byte)(a + b);
       /*Thr process of converting one type of value into another
       is called type-casting.
       Implicit :- Typecasting which is automatically done 
       by the compiler or system is called implicit typecasting
       Explicit :- Typecasting which is done by the
       programmer forcfully is called explicit type casting
       */
       System.out.println(c); // 30
    }
}









































