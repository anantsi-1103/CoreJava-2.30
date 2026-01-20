package OOPs;

public class oops11 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.eat();
        c1.speak();
    }
}

interface Parent {
    void speak();
}

interface Mother {
    void eat();
}

// multiple inheritance -> 
class Child implements Parent,Mother{
    public void speak(){
        System.out.println("Speak by Father");
    }

    public void eat(){
        System.out.println("eat by Mother");
    }
}


