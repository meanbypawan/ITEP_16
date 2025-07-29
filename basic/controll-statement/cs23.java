/*
  for(intialization ; condition; inc/dec){
     statement.1;
     statement.2;
  }
 */
class TestMain{
    public static void main(String args[]){
       for(int i=1; i<=10; i++){
         if(i == 5)
           continue;
         System.out.println(i);
       }  
    }
}