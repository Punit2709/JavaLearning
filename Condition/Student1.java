import java.lang.*;
import java.time.Year;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Student1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);    
        
        // Finding The Radix Of Number
        System.out.println("Enter The Number :- ");
        String num = sc.nextLine();

        if (num.matches("[01]+")) 
        {
            System.out.println("Binary Number");    
        }
        else if (num.matches("[0-7]+")) 
        {
            System.out.println("Octal Number");
        }
        else if (num.matches("[0-9]+")) 
        {
            System.out.println("Decimal Number");
        }
        else
        {
            System.out.println("Hex Number");
        }



        // Finding Year is Leap Year or Not.

        int year = sc.nextInt();

        if (year%4 == 0) 
        {
            if (year%100 == 0) 
            {
                if(year%400 == 0)
                    System.out.println("Yesss Leap-Year");
                else
                    System.out.println("Not Leap-Year");
                
            }
            else
            {
                System.out.println("Yesss Leap-Year");
            }
        }
        else
        {
            System.out.println("Not Leap-Year");
        }
    }

}