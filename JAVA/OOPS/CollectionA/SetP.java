package JAVA.OOPS.CollectionA;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetP {
    public static void main(String[] args) {
        Set <Integer> nums = new TreeSet<>();

        nums.add(1);
        nums.add(22);
        nums.add(10);
        nums.add(3);
        nums.add(1);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
