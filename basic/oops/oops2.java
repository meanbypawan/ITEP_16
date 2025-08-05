/*
  I have a customer of ICICI Bank.
  We have to build a system to manage the data of customer.

  Customer : 
    Properties :---- [id,name,age,contact,accountNo,address,bal]
    behaviour :------balanceEnquiry(), deposite(), withdrawal()
 */

class Customer{
    private int id;
    private String name;
    private String contact;
    private String accountNo;
    private String address;
    private float balance;

    public void setData(int id, String name, String contact, String accountNo,String address, float balance){
       this.id =  id;
       this.name = name;
       this.contact=  contact;
       this.accountNo = accountNo;
       this.address = address;
       this.balance = balance;
    }
    public void balanceEnquiry(){
        System.out.println("Current Balance : "+this.balance);
    }
    public void deposite(int amount){
        this.balance = this.balance + amount;
        System.out.println("After Deposite \n ");
        this.balanceEnquiry(); 
    }
    public void withdrawal(int amount){
        if(amount > this.balance)
          System.out.println("Insufficient Balance In Your Account");
        else{
            this.balance = this.balance - amount;
            this.balanceEnquiry();

        }  
    }
}
class TestMain{
   public static void main(String args[]){
    Customer cheeku = new Customer();
    cheeku.setData(1001,"Cheeku Singh", "9009111222","chk12890","Haveli, Indore",200000);
    cheeku.balanceEnquiry();
    cheeku.deposite(50000);
    cheeku.withdrawal(4500); 
   }
}










