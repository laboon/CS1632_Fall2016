public class FloatingPointError {

    public static void main(String[] args) {
	double oneVal = 1.0 / 857.0;
	double total = oneVal * 857.0;
	boolean areEqual = (total == (double) 1.0);
	System.out.println("total = 1.0? " + areEqual);
	System.out.println("Why?  Because total = " + total);
    }
    
}
