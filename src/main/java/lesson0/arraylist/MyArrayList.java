package lesson0.arraylist;

public class MyArrayList<T> {
    private int capacity;
    private Object[] arrays;
    private int size;

    public MyArrayList() {
        this.capacity = 10;
        this.arrays = new Object[capacity];
    }

    public void add(T value){
        if(size == capacity) resizeArray();

        arrays[size++] = value;
    }

    public T get(int index){
        return (T)arrays[index];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void resizeArray(){
        increaseCapacity();
        Object[] newArray = new Object[capacity];

        for(int i=0; i<arrays.length; i++){
            newArray[i] = arrays[i];
        }
        this.arrays = newArray;
    }

    public void increaseCapacity(){
        //capacity = capacity * 3 / 2 + 1;
        capacity = capacity + (capacity >> 1);
    }
}
