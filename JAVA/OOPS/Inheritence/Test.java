package JAVA.OOPS.Inheritence;



public class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.hello();
        obj.bye();
    }
}

class A{
    public void hello(){
        System.out.println("hello");
    }
}

class B extends A{
    public void bye(){
        System.out.println("bye");
    }
}