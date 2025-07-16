/*
  1. Scanner sc = new Scanner(System.in);
     /*
       1000 line of code...
       =====
       =====
    
     -------------------------------------------
  2. new Scanner(System.in);
     1000 line of code..
     ======
     ======
      
     sc1={} // 2000
     sc2 = 2000;
     sc3 = 2000;

 */
class TestMain{
    public static void main(String args[]){
      Scanner sc1 = new Scanner(System.in);

      Scanner sc2 = sc1;
      Scanner sc3 = sc2;
    }
}


















