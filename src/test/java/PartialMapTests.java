import com.partialmap.PartialMap2;
import com.partialmap.PartialMap3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartialMapTests {

    @Test
    void simplePutAndFetch() {
        var testMap = new PartialMap3<Integer, Integer, Integer, String>();
        testMap.put(1, 2, 3, "Testing");
        assertEquals(testMap.get(1, 2, 3), "Testing");
    }

    @Test
    void applyFirst() {
        var testMap = new PartialMap3<Integer, Integer, Integer, String>();
        testMap.put(1, 2, 3, "Testing");
        PartialMap2<Integer, Integer, String> integerIntegerStringPartialMap2 = testMap.applyFirst(1);
    }

}
