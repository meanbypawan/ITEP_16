class Operation{
  public void updateArray(float arr[]){
     for(int i=0; i<arr.length; i++)
       arr[i] = arr[i]+1;
  }
}

class TestMain{
    public static void main(String args[]){
       float x[] = {10,20,30,40,50};
       Operation obj = new Operation();

       obj.updateArray(x);
       
       for(float element: x)
         System.out.println(element);

    }
}