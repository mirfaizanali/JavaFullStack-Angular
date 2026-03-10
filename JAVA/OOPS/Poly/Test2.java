package JAVA.OOPS.Poly;



public class Test2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.hello();

    }
}

class A{
    public void hello(){
        System.out.println("hello");
    }
}

class B extends A {
    @Override
    public void hello(){
        System.out.println("bye");
    }
}