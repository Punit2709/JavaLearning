package Basic;
import java.util.*;
import java.lang.*;

class ReadKeyboard
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enetred Number is :- " + x);

		// for binary input use radix.
		
		sc.useRadix(2);
		int y = sc.nextInt();
		System.out.println("Enetred Number is :- " + y);
	}
}
		