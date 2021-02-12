import com.partialmap.PartialMap2;
import com.partialmap.PartialMap3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartialMapTests {

    @Test
    void simplePutAndFetch() {
        var testMap = new PartialMap3<Integer, Integer, Integer, String>();
        testMap.put(1, 2, 3, "Testing");
        assertEquals("Testing", testMap.get(1, 2, 3));
    }

    @Test
    void applyFirst() {
        var testMap = new PartialMap3<Integer, Integer, Integer, String>();
        testMap.put(1, 2, 3, "Testing");
        assertEquals("Testing", testMap.applyFirst(1).get(2, 3));
    }

    @Test
    void applySecond() {
        var testMap = new PartialMap3<Integer, Integer, Integer, String>();
        testMap.put(1, 2, 3, "Testing");
        assertEquals("Testing", testMap.applySecond(2).get(1, 3));
    }

    @Test
    void applyThird() {
        var testMap = new PartialMap3<Integer, Integer, Integer, String>();
        testMap.put(1, 2, 3, "Testing");
        assertEquals("Testing", testMap.applyThird(3).get(1, 2));
    }

}
