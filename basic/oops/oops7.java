class Test{
  public void m1(byte x){
    System.out.println("Byte version...");
  }
  public void m1(short x){
    System.out.println("Short version...");
  }
  public void m1(long x){
    System.out.println("Long version...");
  }
  public void m1(float x){
    System.out.println("Float version....");
  }
}

class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1(1L); // HMP : 1, TOP : int
    }
}