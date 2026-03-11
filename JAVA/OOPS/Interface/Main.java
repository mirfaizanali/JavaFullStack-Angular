package JAVA.OOPS.Interface;

@FunctionalInterface
interface A{
    void show();

}

public class Main {

    public static void main(String[] args) {

        A obj = () -> System.out.println("Self imp");

        obj.show();
    }
}
