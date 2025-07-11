/*
     Integer Representation :-
       1. Decimal --Base 10 [0-9]
       2. Octal   --Base 8  [0-7]
       3. Hexa-decimal-base 16 [0-9,a,b,c,d,e,f]

     char x;

     c/c++ :-  char x;
     2. In C , char variable create 1-byte memory block
        1-byte == 8-bit ---> 2^8 ---> 256
     3. Standard Code ----> ASCII[American Standard Code For Infomration Interchange]   
     
     Java  :- char x;
     2. In Java, char variable create 2-byte memory block
        2-byte == 16-bit---->2^16 --> 65536
     3. Uni-code [16-bit Hexadecimal Code]
 */
class TestMain{
    public static void main(String args[]){
       //int x = 0101;
       int x = 0x41;
       System.out.printf("Decimal : %d\n",x); // %d -- Decimal
       System.out.printf("Octal  : %o\n",x); // %o --Octal
       System.out.printf("Hexa : %x\n",x);
    }
}





















