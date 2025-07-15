/*
  Logical Operation :-
   1. && [AND]
   2. || [OR]
   3. ! [NOT]
   -----------------------------
   && , ||
   --------------
   Boolean Data ;-
   1. true
   2. false
   3. Relation Expression
   ---------------------------------

   A        B       A && B          A || B
  (a>b)    (c<d)   (a>b) && (c<d)   (a>b) || (c<d)
   true     false   false           true
   false    true    false           true
   true     true    true            true
   false    false   false           false

 */
class TestMain{
    public static void main(String args[]){
      int a,b,c,d;
      a = 10;
      b = 20;
      c = 30;
      d = 40;

      boolean x = (a>b) && (++c<d) || (++a<d);
      /*
          x = (a>b) && (++c<d) || (++a<d)
          x = false && (++c<d) || (++a<d)
          x =             false||(11<40)
          x = false || true
          x = true
       */
      System.out.println("a  : "+a);
      System.out.println("b  : "+b);
      System.out.println("c  : "+c);
      System.out.println("d  : "+d);
      System.out.println("x  : "+x);
      
    }
}





