import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {
        int result = 2 + 2;
        assertEquals("2 + 2 = 4", 4, result);
    }
}
