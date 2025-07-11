/*
  class Test{
    byte x; // 0
  }
  Default initial value conept applicable for data member
  byte --- 0
  int-----0
  short---0
  long----0
  float ---0.0
  double---0.0
  char-----\0
  boolean---false
 */
class Test{
    public static void main(String args[]){
        byte x; // Variable x might not have been initialized
        System.out.println(x);
    }
}









