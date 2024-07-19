package Basic;
import java.util.*;
import java.lang.Math.*;

public class Root
{
	public static void main(String[] args)
	{
		float a, b , c;
		System.out.println("Enter a , b, c ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		System.out.println("Your Eq. :- " + a + "x2 " + b + "x " + c + " = 0." );

		double r1 = (-b + Math.sqrt(b*b - 4*a*c) ) / (2 * a) ;
		double r2 = (-b - Math.sqrt(b*b - 4*a*c) ) / (2 * a) ;

		System.out.println("Roots Of Eq. = " + r1 +  " and " + r2);
 
	}
}