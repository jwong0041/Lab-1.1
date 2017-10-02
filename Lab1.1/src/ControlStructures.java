//Joyin Wong :> thats me
public class ControlStructures 
{
	public static void main (String [] args) 
	{
		printPrime();
		fooBarBaz();
		System.out.println("Task Complete.");
	}
	//first 50 prime #'s
	//10 prime numbers per line
	public static void printPrime () 
	{
		int w;
		for (w=1; w<=51; w++)
		{
			if (isPrime(w) == true)
			{
				System.out.println(w);
			}
		}
	}
	public static boolean isPrime (int y)
	{
		int z;
		for (z=2; z<y; z++)
		{
			if (y % z == 0) {
				return false;
			}
		}
		return true;
	}
	//print #'s 1-500
	//replace multiples of 3 with foo
	//replace multiples of 7 with Bar
	//replace multiples of 10 with Baz
	public static void fooBarBaz () 
	{
		int x = 1;
		// x > 0
		for (x = 1; x <= 500; x++) {
			if (((x % 3) == 0) && ((x % 7) == 0) && ((x % 10) == 0)) {
				System.out.println("fooBarBaz");
			} else if (((x % 3) == 0) && ((x % 7) == 0)) {
				System.out.println("fooBar");
			} else if (((x % 3) == 0) && ((x % 10) == 0)) {
				System.out.println("fooBaz");
			} else if (((x % 7) == 0) && ((x % 10) == 0)) {
				System.out.println("BarBaz");
			} else if ((x % 3) == 0) {
					System.out.println("foo");
				} else if ((x % 7) == 0) {
					System.out.println("Bar");
				} else if ((x % 10) == 0) {
					System.out.println("Baz");
				} else {
					System.out.println(x);
				}
		}
	}
}