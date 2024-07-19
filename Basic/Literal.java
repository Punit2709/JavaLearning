import java.util.*;
import java.lang.*;

class Literal
{
	public static void main(String[] args)
	{
		byte a = 0x1A; // this is in hexadecimal
		byte b = 015; // this is in octal
		byte c = 0b1010; // this is in binary
		byte d = 15; // this is in decimal

		long l = 999_999_999L;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(l);
	}
}

