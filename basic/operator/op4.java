/*
  Increment/Decrement [++, --]

  Increment :-
    int x = 10;

    1. ++x[Pre-increment] :- Pre-increment first increment the value
    by one then assign

    2. x++[Post-increment]:- Post-increment first assign the value
    then increment by one
    ++x ---> x = x + 1
 */
class TestMain{
    public static void main(String args[]){
       int x = 10;
       x++;
       System.out.println("x : "+x); // 11
    }
}








