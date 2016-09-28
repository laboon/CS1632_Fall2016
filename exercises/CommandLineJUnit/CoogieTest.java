import org.junit.Test;
import static org.junit.Assert.*;

public class CoogieTest {
	
    @Test
    public void testMeowAndBarkAreEqualWillFail() {
	assertEquals("Meow", "Bark");
    }

    @Test
    public void testShouldPass() {
	int z = 2;
	assertTrue(z == 2);
    }
    
}
