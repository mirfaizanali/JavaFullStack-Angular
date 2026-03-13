package JAVA.OOPS.CollectionA;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListP {

    public static void main(String[] args) {
        Collection <Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(6);
        nums.add(8);

        for (int c : nums){
            System.out.println(c);
        }
    }
}
