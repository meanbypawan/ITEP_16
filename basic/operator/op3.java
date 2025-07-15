class TestMain{
    public static void main(String rg[]){
        int a,b,c,d;
        a = 10;
        b = 10;
        c = 10;
        d = 10;
        int x = (a == b) == (c == d);
        /*
           x = (a == b) == (c == d);
                10 == 10
                   true == (c == d)
                   true == (10 == 10)
                   true == true
                       true
         */
        System.out.println("x : "+x);
    }
}