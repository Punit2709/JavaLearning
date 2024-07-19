import java.lang.*;
import java.util.*;

public class SwitchCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int day =sc.nextInt();
        
        // switch case only takes "CHAR", "BYTE", "SHORT", "INT" and "STRING" type of value
        // not accept float long type od values.

        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            
            case 2:
                System.out.println("TUESDAY");
                break;

            case 3:
                System.out.println("WEDNESDAY");
                break;
            
            case 4:
                System.out.println("THURSDAY");
                break;

            case 5:
                System.out.println("FRIDAY");
                break;

            case 6:
                System.out.println("SATURDAY");
                break;

            case 7:
                System.out.println("SUNDAY");
                break;
        
            default:
                System.out.println("NOT VALID DAY");
        }

    }

}