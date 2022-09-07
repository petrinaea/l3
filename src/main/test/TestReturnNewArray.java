import lesson_6.ReturnNewArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestReturnNewArray {

    @Test
    void testArray() {
        ReturnNewArray newArray = new ReturnNewArray();
        int [] array1 = {0, 9, 4, 9, 1, 5};
        int [] arrayTest1 = newArray.returnNewArray(array1);
        int [] arrayRes1 = {9, 1, 5};
        assertArrayEquals(arrayRes1, arrayTest1);

        int [] array2 = {4, 1, 1, 1, 1, 1};
        int [] arrayTest2 = newArray.returnNewArray(array2);
        int [] arrayRes2 = {1, 1, 1, 1, 1};
        assertArrayEquals(arrayRes2, arrayTest2);

    }
}
