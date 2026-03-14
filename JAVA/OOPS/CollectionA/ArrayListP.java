package JAVA.OOPS.CollectionA;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListP {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(1);
        for(int n: arr){
            System.out.println(n);
        }


    }
}

