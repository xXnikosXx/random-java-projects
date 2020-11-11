package MyFirstPackage;

public class testingClassCalling {

	static void trialMethod() {

		int x = 0;
		int y = 0;
		int z = 0;
		
		if (x == 0 || y == 0 || z == 0) {
			System.out.println("shit went wrong fam");
		}
		else if (x > y) {
			System.out.println("x value is greater than y value");
		}
		else if( x > z ) {
			System.out.println("x value is greater than z value");
		}
		else if (y > z) {
			System.out.println("y value is greater than z value");
		}
		else {
			System.out.println("you done fucked up");
		}
		
	}

}
