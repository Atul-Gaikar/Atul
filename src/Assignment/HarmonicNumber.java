package Assignment;


//Purpose: Program to Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 
import java.util.Scanner;

public class HarmonicNumber {
//Function to calculate the nth harmonic number
//@param n the value of harmonic number
	 
	static double harmonic(int n) {
		double h = 1;
		for (double i = 2; i <= n; i++) {
			h = h + 1 / i;
		}
		return h;
	}

//main method to test the class
//@param ars
	 
	public static void main(String[] ars) {
		Scanner s = new Scanner(System.in);
// try and catch to not terminate at wrong input
		try {
			System.out.println("enter harmonic no to find");
			int n = s.nextInt();
			System.out.println(harmonic(n));

		} catch (Exception e) {
			System.out.println("enter integer");
			main(ars);
		}
		s.close();
	}
}
