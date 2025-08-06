/*
   Operation :--
     properties :-- a,b [200]
     behavoiur:---- add()
 */

class Operation{
    private int a;
    private int b;
    public void setData(int a, int b){
        this.a  = a;
        this.b = b;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
      this.b = b;
    }
    public int getB(){
        return b;
    }
    public void display(){
        System.out.println("a : "+a+" b : "+b);
    }
    public void add(){
        System.out.println("Addition : "+(a+b));
    }
}
class TestMain{
    public static void main(String args[]){
        Operation obj = new Operation(); // obj= {a:0,b:0,add()}
        obj.setA(20);
        obj.setB(10);
        obj.display();
    }
}