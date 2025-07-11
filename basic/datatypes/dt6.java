/*
  Floating Point
  3.14, -0.5
  float------> 3.14f
  double ----> 3.14

  area = 1/2 * b * h
  where b & h both are the integer
 */
class TestMain{
    public static void main(String args[]){
        int b,h;
        float area;
        b = 2;
        h = 3;
        //area = (float)(1/2.0 * b * h);
        area = 1/2.0f * b * h;
        System.out.println("Area : "+area);
    }
}












