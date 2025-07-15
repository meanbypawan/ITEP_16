class TestMain{
    public static void main(String arggs[]){
        int a,b,c,d;
        a = 10;
        b = 12;
        c = 8;
        d = 5;

        a = ++c;
        c = d++;
        b = a++;
        d = ++b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
    }
}