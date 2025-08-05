class Operation{
   private int a;
   private int b;
   public void setData(int x, int y){
    a = x;
    b = y;
   }
   public void add(){
    System.out.println("Sum : "+(a+b));
   }
}
class TestMain{
    public static void main(String args[]){
       Operation obj = new Operation();// obj = {a:0,b:0, add()}
       obj.setData(20,10); // obj = {a:20,b:10, add()}
       obj.add(); // 0
    }
}