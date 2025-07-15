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
       System.out.println(true||false); // false
       System.out.println(false||true); // false
       System.out.println(true||true); // true
       System.out.println(false||false); // false
    }
}

































