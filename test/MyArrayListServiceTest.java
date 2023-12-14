import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;


class MyArrayListServiceTest {
    @Disabled("Этот тест временно игнорируется")
    @Test
    public void testPrintArrayList() {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Hello", "World", "Test"));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ArrayList printer = new ArrayList(arrayList);
        String printedOutput = outputStream.toString().trim(); // Trim to remove extra whitespace

        System.setOut(originalOut);

        String expectedOutput = "Hello\nWorld\nTest"; // Expected output after printing each element
        assertEquals(expectedOutput, printedOutput);
    }


}