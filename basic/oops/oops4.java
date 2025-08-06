/*
  Method Overloading is very simple in java.
  ------------------------------------------------------
  Polymorphism :- One thing has different different implementation.
  General :- one thing many forms.
  Two types of polymorphims :-
    1. Compile Time [Overloading]
    2. Runtime [Overriding]

  Method Overloading :-
    Defining multiple method with the same name whose
    parameters are different.

    How to keep parameters different :-
     1. In numbers
     2. In Types
     3. In Sequence

    Note :- In case of method overloading return doesn't matter.
    means you can keep same return type while overloading
    or you change it while oveloading , no problem atall 
    ----------------------------
    class PrintStream{
      public void println(byte x){}
      public void println(short x){}
      public void println(int x){}
      public void println(long x){}
      public void println(String x){}
      public void println(boolean x){}
    
    }
    ------------------------------------------------------
    In case of method overloading , compiler first go for
    perfect matching , if perfect matching is not found then
    compiler will go fro suitable matching, if suitable 
    matching is not found then compiler will generate an error.

    Note :- If multiple suitable matching found then
    still compiler will generate an error . call to xyx method is
    ambigous.
 */
class TestMain{
    public static void main(String args[]){
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        String s = "Hello";
        boolean e = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(e);
    }
}