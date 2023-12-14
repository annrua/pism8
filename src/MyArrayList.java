import java.util.LinkedList;

public class MyArrayList<T> {
    private int maxSize;
    private final LinkedList<T> collection = new LinkedList<>();

    public MyArrayList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (collection.size() >= maxSize) {
            collection.removeFirst();
        }
        collection.addLast(item);
    }

    public LinkedList<T> getCollection() {
        return collection;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        while (collection.size() > maxSize) {
            collection.removeFirst();
        }
    }

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>(5);

        for (int i = 1; i <= 10; i++) {
            myArrayList.add(i);
            System.out.println("Added: " + i);
            System.out.println("Collection: " + myArrayList.getCollection());
        }
    }
}
