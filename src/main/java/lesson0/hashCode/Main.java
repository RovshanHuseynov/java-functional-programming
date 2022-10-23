package lesson0.hashCode;

import java.util.Objects;

public class Main {
    // source video: https://www.youtube.com/watch?v=CpVALR9HeTE
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rovshan", 30);
        Employee emp2 = new Employee("Rovshan", 30);

        System.out.println(emp1 == emp2);
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        Objects.hash();

        Employee emp3 = null;
        // hashCode of a null must be 0
        //System.out.println(emp3.hashCode());

        /* results when hashCode method is overriden
        false
        true
        lesson0.hashCode.Employee@5d578d4
        lesson0.hashCode.Employee@5d578d4
        97876180
        97876180
        first
         */

        /* results when hashCode method is NOT overriden
        false
        true
        lesson0.hashCode.Employee@2133c8f8
        lesson0.hashCode.Employee@43a25848
        557041912
        1134712904
        null
         */

        System.out.println("-------------------------------");
        Object o1 = new Object();
        Object o2 = o1;
        Object o3 = new Object();
        // default impl of Object class equals() method
        // because it checks pointing references, adresses
        System.out.println(o1.equals(o2)); // true
        System.out.println(o1.equals(o3)); // false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());
    }
}
