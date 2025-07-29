/*
  Large Amount
  Quantity known in advance
  Data is also known
 */
class TestMain{
    public static void main(String args[]){
        //            0 ,  1 ,  2,   3,   4
        int arr[] = {101, 200, 143, 900, 555};

        System.out.println(arr.length);
        
        int sum = 0;
        for(int i=0; i<arr.length; i++){
          sum = sum + arr[i];
        }
        System.out.println("Sum : "+sum);
    }
}