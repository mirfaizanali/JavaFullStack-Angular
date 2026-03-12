package JAVA.OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int []arr = new int[5];

        try{
//            j = 18/i;
            System.out.println(arr[1]);
            System.out.println(arr[6]);


        }
        catch (ArithmeticException e){
            System.out.println("Something went wrong ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }catch (Exception e){
            System.out.println("TTTTTTTTTTTT");
        }

        System.out.println("Hello faizan");
    }
}
