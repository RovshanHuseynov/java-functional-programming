package lesson0.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rovshan", 30);
        Employee emp2 = new Employee("Rovshan", 30);

        System.out.println(emp1 == emp2);
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee("Rovshan", 30), "first");
        System.out.println(map.get(new Employee("Rovshan", 30)));

        /* map.get(object) - object.hashCode() methoduna əsasən gedib lazım olan bucketi
        tapır. əgər hashCode() methodunu override etməmişiksə map.get() düzgün işləməyəcək
        yəni gedib biz istədiyimiz elementi tapıb gətirə bilməyəcək
         */

        /* results when hashCode method is overriden
        false
        true
        lesson0.hashmap.Employee@5d578d4
        lesson0.hashmap.Employee@5d578d4
        97876180
        97876180
        first
         */

        /* results when hashCode method is NOT overriden
        false
        true
        lesson0.hashmap.Employee@2133c8f8
        lesson0.hashmap.Employee@43a25848
        557041912
        1134712904
        null
         */
    }
}
