package OOPs;

public class oops6 {
    public static void main(String[] args) {
        Dog d = new Dog(); // dog ka object 
        d.speak();
        d.eat();
        d.breathe();
    }
}

class Animal {
    void breathe() {
        System.out.println("Breathing");
    }

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Bark");
    }
}

class babyDog extends Dog{
    void sleep(){
        System.out.println("Baby Sleeping");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("MEOW");
    }
}

