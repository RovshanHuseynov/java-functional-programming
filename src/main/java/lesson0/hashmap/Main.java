package lesson0.hashmap;

import lesson0.hashCode.Employee;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // source video: https://www.youtube.com/watch?v=-oafFAPgLao
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee("Rovshan", 30), "first");
        System.out.println(map.get(new Employee("Rovshan", 30)));

        /* map.get(object) - object.hashCode() & (capacity - 1) düsturuna əsasən gedib lazım olan
        bucketi tapır. əgər hashCode() methodunu override etməmişiksə map.get() düzgün işləməyəcək
        yəni gedib biz istədiyimiz elementi tapıb gətirə bilməyəcək
         */

        System.out.println("---------------------------------------------------------");
        MyHashMap<String, Integer> myMap = new MyHashMap<>();
        myMap.put("Rovshan", 28);
        myMap.put("Osman", 23);
        System.out.println(myMap.get("Rovshan"));
        System.out.println(myMap.get("Osman"));
    }
}
