class Test{
    public void m1(){
        System.out.println("m1-default()");
    }
    public void m1(int x){
        System.out.println("Int version");
    }
    public void m1(int x, int y){
        System.out.println("Int Int Version..");
    }
}
class TestMain{
    public static void main(String r[]){
        Test obj = new Test();
        obj.m1(10); // HMP : 1, TOP : int
        obj.m1(20,10); // HMP : 2, TOP: int,int
    }
}