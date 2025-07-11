/*

   Member [private,<default>, protected, public]
   |--1 Instance [Belongs To Object]
        |--Data member [Variable defined at the class scope]
        |--Method 
   |--2 static
        |--Data member [Variable defined at the class scope]
        |--Method
  C.E :- class GreetUser is a public , should be declared in
  file named GreetUser.java      
 */
public class GreetUser{
    public static void main(String args[]){
        System.out.println("Good Morning Indore....");
        A.main();
    }
}
class A{
   public static void main(){
    System.out.println("Hello M1()....");
   }
}