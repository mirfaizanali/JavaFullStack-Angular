package JAVA.OOPS.ExceptionHandling;

public class EThrow {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;


        try{
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("i don't want to print zero");

        }
        catch (ArithmeticException e){
            j = 18/1;
            System.out.println("That's the default option " + e);
        }
        catch (Exception e){
            System.out.println("TTTTTTTTTTTT");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

