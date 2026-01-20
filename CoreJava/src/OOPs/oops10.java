package OOPs;

public class oops10 {
    public static void main(String[] args) {
        System.out.println("hello");
        Payment p1 = new UPI();
        p1.pay();

        Payment p2 = new CC();
        p2.pay();
    }
}


interface Payment{
    void pay();
}

class UPI implements Payment{

    public void pay(){
       System.out.println("Payment through UPI");
    }
}

class CC implements Payment{

    public void pay(){
       System.out.println("Payment through CC");
    }
}