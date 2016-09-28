public class Noogie {

    private int numCats = 0;

    public Noogie(int startingCats) {
	numCats = startingCats;
    }

    public int getNumCats() {
	return numCats;
    }

    public int negativeCats() {
	return -1 * numCats;
    }
    
    public void addSomeCats(int x) {
	numCats += x;
    }

}
