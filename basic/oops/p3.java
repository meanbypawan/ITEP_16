class Operation{
    public boolean isPrime(int n){
       for(int i=2; i<=n/2; i++){
        if(n%i == 0){
          return false;
        }
       }
       if(n < 2)
         return false;
       return true;  
    }
}

class TestMain{
    public static void main(String args[]){
       Operation obj = new Operation();
       for(int i=2; i<=50; i++){
         boolean status=  obj.isPrime(i);
         if(status)
           System.out.println(i);
       }
    }
}