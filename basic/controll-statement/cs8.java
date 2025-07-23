import java.util.Scanner;
class TestMain{
    public static void main(String arggs[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please let me know your age");
      int age = sc.nextInt();

      System.out.println("Please let me know your gender");
      char gender = sc.next().charAt(0);

      System.out.println("Are you married (Y/N)");
      char maritalStatus = sc.next().charAt(0);

      if(gender == 'F' || gender == 'f')
        System.out.println("Place of Service : Urban Area");
      else if((gender == 'M' || gender == 'm') && (age >=20 && age <=40))
         System.out.println("Place of Service : Any where");
      else if ((gender == 'M'|| gender == 'm') && (age>40 && age <=60))
         System.out.println("Place of Service : Urban Area");
    }
}










