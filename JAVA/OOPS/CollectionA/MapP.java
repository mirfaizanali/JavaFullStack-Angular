package JAVA.OOPS.CollectionA;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapP {
    public static void main(String[] args) {
        Map <String,Integer> students = new Hashtable<>();
        students.put("Faizan",100);
        students.put("Karim",50);
        students.put("Mir",52);

        for(String name: students.keySet()){
            System.out.println(name + " : "+students.get(name));
        }
    }
}
