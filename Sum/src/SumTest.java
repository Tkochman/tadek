import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pawel on 08.10.15.
 */
public class SumTest {

    @org.junit.Test
    public void testDodaj() throws Exception {
        Sum sum = new Sum();

        int result = sum.dodaj(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testMain() throws Exception {

    }

    @Test
    public void testDodaj1() throws Exception {

    }
}