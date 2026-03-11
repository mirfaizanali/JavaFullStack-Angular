package JAVA.OOPS.Poly;

class Animal{
    public void showtheDataWhichBewlong(){
        System.out.println("In Animal");
    }
}

class Cat extends Animal{
    @Override
    public void showtheDataWhichBewlong(){
        System.out.println("In Cat");
    }
}

public class Practice  {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.showtheDataWhichBewlong();
    }
}

