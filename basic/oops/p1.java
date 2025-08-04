/*
  Method In Java :-
   1. Instance :--- It is belongs to object  
   2. Statis   :---It belongs to class
 */
class TestMethod{
    public static void greetUser(){ // Method Definition
        System.out.println("Good Morning Student...");
    }
    public void wish(){
        System.out.println("Good Luck....");
    }
}
class TestMain{
    public static void main(String args[]){
       TestMethod.greetUser(); // Method calling
       TestMethod.greetUser();
       
       TestMethod tm =  new TestMethod();
       tm.wish();
    }
}