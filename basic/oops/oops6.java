class Test{
    public void m1(int x){
        System.out.println("int version....");
    }
    public void m1(float x){
        System.out.println("float version....");
    }
}

class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1(20); // HMP : 1, TOP : int
    }
}