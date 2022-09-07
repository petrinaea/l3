import lesson_6.CheckArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCheckArray {

    @Test
    void checkArray() {

        CheckArray checkArray = new CheckArray();
        int[] array1 = {1, 1, 4};
        boolean actual1 = checkArray.checkArray(array1);
        assertTrue(actual1);

        int[] array2 = {1, 9, 4};
        boolean actual2 = checkArray.checkArray(array2);
        assertTrue(actual2);

        int[] array3 = {1, 1, 1};
        boolean actual3 = checkArray.checkArray(array3);
        assertTrue(actual3);

        int[] array4 = {1, 1, 1};
        boolean actual4 = checkArray.checkArray(array4);
        assertTrue(actual4);

    }
}
