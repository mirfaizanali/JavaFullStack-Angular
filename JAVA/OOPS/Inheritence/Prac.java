package JAVA.OOPS.Inheritence;
class D{
    public void he(){
        System.out.println("hello");
    }
}

class E extends D{
    public void by(){
        System.out.println("bye");
    }
}

public class Prac {
    public static void main(String[] args) {
        E xyz = new E();
        xyz.by();
    }
}


