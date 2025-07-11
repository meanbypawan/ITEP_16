/*
   public :-- It is access modifier . Main is public sothat jvm can
   call main method from anywhere.
   static :- Because jvm call the main method by using class name.
   void :- In Java main method doesn't return any value
   main :- It is an identifier, name of the method
   Why the name of this method is main :- You should ask this
   question to James gosling.
   String :- While running the application form comman line 
   you can pass any type of data.
   Why parameter is of array type [] :- we can pass multiple i/p data.
   
   Valid signature of main method in java :-
   1. public static void main(String args[])
   2. public static final void main(String args[])
   3. public static synchronized void main(String args[])
   4. public static strictfp[strict floating-point] void main(String args[])
   5. public static void main(String... args)
   6. public static final synchronized strictfp void main(String... args)
 */
class Test{
    public static void main(String... args){
        System.out.println("Java is very simple...");
    }
}















