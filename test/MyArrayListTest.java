import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {
    private MyArrayList<Integer> collection;

    @BeforeEach
    public void setUp() {
        collection = new MyArrayList<>(3);
    }

    @Test
    public void testAdd() {
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);

        assertEquals(expected, collection.getCollection());
    }

    @Test
    public void testGetMaxSize() {
        int expected = 3;
        int actual = collection.getMaxSize();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCollectionAndMaxSize() {
        MyArrayList<String> myArrayList = new MyArrayList<>(3);

        myArrayList.add("apple");
        myArrayList.add("banana");

        LinkedList<String> expectedCollection = new LinkedList<>();
        expectedCollection.add("apple");
        expectedCollection.add("banana");

        assertEquals(expectedCollection, myArrayList.getCollection());
        assertEquals(3, myArrayList.getMaxSize());
    }

}