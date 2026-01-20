package OOPs;

public class oops7{
    public static void main(String[] args) {
       Calculation c1 = new Calculation();
      System.out.println(c1.sum(10, 20));
      System.out.println(c1.sum(10, 20,76));
      System.out.println(c1.sum((float)10.7, (float)20.8));



      System.out.println("Aman" + " "+"Singh"); // concat
      System.out.println(1+2); // add

    }
}

class Calculation{

    int sum(int a , int b){
        return a+b;
    }

    int sum(int a, int b , int c){
        return a+b+c;
    }

    float sum(float a, float b){
        return a+b;
    }
}