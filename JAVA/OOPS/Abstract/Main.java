package JAVA.OOPS.Abstract;

abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{
    void eat(){
        System.out.println("Cat eats cat food");
    }
}

public class Main {
    public static void main(String[] args) {
            Animal animal = new Cat();
            animal.eat();
    }
}
