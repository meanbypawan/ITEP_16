class TestMain{
    public static void main(String args[]){
        float x = 1.1f;
        switch(x){
          case 1: System.out.println("Matched...");break;
          case 'a': System.out.println("Matched...");break;
          default: System.out.println("Not Matched...");
        }
    }
}