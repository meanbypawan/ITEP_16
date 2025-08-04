class Operation{
   public void add(int a, int b){ // arg-list
      System.out.println("a : "+a);
      System.out.println("b : "+b);
      System.out.println("Sum : "+(a+b));
   }
   public int multiplication(int a, int b){
     return a*b;
   }
   public String getMessage(){
    return "Hello";
   }
}

class TestMain{
    public static void main(String args[]){
        Operation obj = new Operation();
        obj.add(20,10);
        int result = obj.multiplication(20,10);
        System.out.println("Multiplication : "+result);
    
        String s = obj.getMessage();
        System.out.println(s);
    }
}