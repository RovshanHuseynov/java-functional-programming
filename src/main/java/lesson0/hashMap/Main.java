package lesson0.hashMap;

public class Main {
    // source video: https://www.youtube.com/watch?v=-oafFAPgLao
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        MyHashMap<String, Integer> myMap = new MyHashMap<>();
        myMap.put("Rovshan", 28);
        myMap.put("Osman", 23);
        System.out.println(myMap.get("Rovshan"));
        System.out.println(myMap.get("Osman"));
    }
}
