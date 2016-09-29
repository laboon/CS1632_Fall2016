public class Noogie {

    /**
     * Number of cats this Noogie has.
     */
    
    private int numCats = 0;

    /**
     * Constructor.   Instantiates a Noogie instance.
     * @param startingCats - number of cats to start with
     */
    
    public Noogie(int startingCats) {
	numCats = startingCats;
    }

    /**
     * Accessor.  Returns number of cats this Noogie has.
     * @return int Number of cats
     */
    
    public int getNumCats() {
	return numCats;
    }

    /**
     * Returns the negative identity of the number of cats.
     * @return int the number of cats multiplied by -1
     */
    
    public int negativeCats() {
	return -1 * numCats;
    }

    /**
     * Mutator.  Adds a number of cats to a Noogie.
     * @param x Number of cats to add to this Noogie
     * @throws ArithmeticException if numCats is negative
     */
    
    public void addSomeCats(int x) throws ArithmeticException {
	if (x < 0) {
	    throw new ArithmeticException();
	} else {
	    numCats += x;
	}
    }

}
