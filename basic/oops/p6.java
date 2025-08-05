class Operation{
    public int updateData(int x){
        x = x + 2;
    }
}
class TestMain{
    public static void main(String args[]){
        Operation obj = new Operation();
        int x = 10;
        obj.updateData(x); // 10
        System.out.println("x : "+x); // 10
    }
}