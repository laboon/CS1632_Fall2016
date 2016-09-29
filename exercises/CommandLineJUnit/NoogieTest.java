import org.junit.Test;
import static org.junit.Assert.*;

public class NoogieTest {

    // The following two tests should always pass.
    // They don't really check anything.
    
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

    // This test should ALWAYS fail - it creates an object
    // and then checks if its ref is null. 
    
    @Test
    public void testShouldFail() {
	Object o = new Object();
	assertNull(o);
    }

    // Actual Noogie Tests - from here to the end of the file,
    // these actually test aspects of the Noogie class.

    // Test to see that if we create a Noogie object with 0 cats,
    // getting the number of cats will return 0.
    
    @Test
    public void testNoogieNumCats0() {
	Noogie n = new Noogie(0);
	assertEquals(n.getNumCats(), 0);
    }

    // Test to see that if we create a Noogie object with 10 cats,
    // getting the number of cats will return 10.
    
    @Test
    public void testNoogieNumCats10() {
	Noogie n = new Noogie(10);
	assertEquals(n.getNumCats(), 10);
    }

    // Test that for a Noogie with a positive # of cats, if we call
    // the negativeCats() method, it will return the correct
    // number of (negative) cats.
    
    @Test
    public void testNegative() {
	Noogie n = new Noogie(5);
	assertEquals(n.negativeCats(), -5);
    }

    // Test that for a Noogie with a negative # of cats, if we call
    // the negativeCats() method, it will return the correct
    // number of (positive) cats.
    
    @Test
    public void testDoubleNegative() {
	Noogie n = new Noogie(-5);
	assertEquals(n.negativeCats(), 5);
    }

    // Test adding a positive number of cats.
    
    @Test
    public void testAdd1() {
	Noogie n = new Noogie(0);
	n.addSomeCats(1);
	assertEquals(n.getNumCats(), 1);
    }

    // Test adding a negative number of cats throws an exception.
    
    @Test
    public void testNegativeAdd() {
	Noogie n = new Noogie(0);
	try {
	    n.addSomeCats(-2);
	    // Note that if fail() is called, result will be "null" and that is
	    // what will be displayed in the TestRunner
	    fail();
	} catch (ArithmeticException aex) {
	    // expected behavior
	}
	// Number of cats should remain 0 (initial value)
	assertEquals(n.getNumCats(), 0);

    }

    // Test adding cats multiple times.
    
    @Test
    public void testMultipleAdds() {
	Noogie n = new Noogie(0);
	for (int j = 0; j < 10; j++) {
	    n.addSomeCats(5);
	}
	assertEquals(n.getNumCats(), 50);
    }

    
    
}
