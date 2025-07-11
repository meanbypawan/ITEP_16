/*
  Operator :- It is symbol that perform the operation on operand
  2 + 3

  + ---> operator
  2,3 --> operand[data]

  -20 , ++x
  Unary operator
  Binary 
  Ternery
  --------------------------------------
  1. Arithmetic (+,-,*,/,%)
  2. Relational (>,<,>=,<=,==,!=)
  3. Logical (&&(AND), ||(OR), !(NOT))
  4. Increment/Decrment (++, --)
  5. Assignment  (=)
  6. Bitwise  (&, |, ^, <<, >>, ~)
  7. Conditional Op ( ? : )
  8. Shorthand (+=, -=, *=, /=)
  9. instanceOf
  --------------------------------------
  Operator :-
    1. Precedence :- a + b * c / d - e
    2. Associativity
       Left--->Right
       Right-->Left
*/
class TestMain{
    public static void main(String args[]){
      System.out.println("7/2 : "+(7/2)); // 3
      System.out.println("7%2 : "+(7%2)); // 1
      System.out.println("-7%2 : "+(-7%2)); // -1
      System.out.println("7%-2 : "+(7%-2)); // 1 
      System.out.println("-7%-2 : "+(-7%-2)); // 
      System.out.println("2%7 : "+(2%7));
      //System.out.println("7/0 : "+(7/0)); // ArithmeticException
      //System.out.println("7%0 : "+(7%0));
      System.out.println("7.5%2 : "+(7.5%2)); // 1.5
      System.out.println("7.5%0 : "+(7.5%0)); // NaN
      System.out.println("7.5/0 : "+(7.5/0));
      System.out.println("-7.5/0 : "+(-7.5/0));
      System.out.println("0/7 : "+(0/7)); //0
    }
}



















