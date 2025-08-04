class Operation{
  public float sumOfArray(float arr[]){
    float sum = 0;
    for(float element : arr)
      sum = sum + element;
    return sum;  
  }
}

class TestMain{
    public static void main(String args[]){
        float arr[] = {1.3f,5,8,9,6,4};
        Operation obj = new Operation();
        float sum = obj.sumOfArray(arr);
        System.out.println("Sum : "+sum);
    }
}