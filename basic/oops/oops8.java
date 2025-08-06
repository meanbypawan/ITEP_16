class Test{
    public void m1(int x, long y){
        System.out.println("Int-Long Version...");
    }
    public void m1(long x, int y){
        System.out.println("Long-Int Version...");
    }
    public void m1(int x, int y){
        System.out.println("Int-Int Version...");
    }

}
class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1(20,10); // HMP: 2 , TOP: int,int
    }
}