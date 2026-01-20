package OOPs;

public class oops9 {
    public static void main(String[] args) {
        Animal1 a = new Dog1();
        a.sound();
        a.eat();
    }
}

abstract class Animal1 {
    abstract void sound();
    // no body

    void eat() {
        System.out.println("Animals eats food");
    }
}

class Dog1 extends Animal1 {

    void sound() {
        System.out.println("Dogs Bark");
    }

    
}
