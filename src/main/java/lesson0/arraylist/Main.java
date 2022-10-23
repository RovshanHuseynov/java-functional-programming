package lesson0.arraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        System.out.println("size: " + list.getSize());
        System.out.println("capacity: " + list.getCapacity());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("size: " + list.getSize());
        System.out.println("capacity: " + list.getCapacity());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        System.out.println("size: " + list.getSize());
        System.out.println("capacity: " + list.getCapacity());
    }
}
