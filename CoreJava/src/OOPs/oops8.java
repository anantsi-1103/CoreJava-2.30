package OOPs;

public class oops8 {
    public static void main(String[] args) {
        B c = new B();
        c.speak();
    }
}

class A {
    void speak() {
        System.out.println("Hindi by Father");
    }
}

class B extends A {

    @Override // bypass krdiya A ko
    void speak() {
        System.out.println("English");
    }
}