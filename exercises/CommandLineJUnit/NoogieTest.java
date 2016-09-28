import org.junit.Test;
import static org.junit.Assert.*;

public class NoogieTest {
	
    @Test
    public void testShouldPass() {
	assertEquals(1, 1);
    }

    @Test
    public void testShouldAlsoPass() {
	int x = 1;
	int y = 1;
	int z = x + y;
	assertTrue(z == 2);
    }

    @Test
    public void testShouldFail() {
	Object o = new Object();
	assertNull(o);
    }
    
    
}
