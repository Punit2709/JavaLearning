import java.lang.*;
import java.util.*;

public class StudentChallenge1
{
    public static void main(String[] args)
    {
        // find number is bianry or not
        // Find number is Hexa decimal or not
        // find data is in Date format or not DD/MM/YYYY

        Scanner sc = new Scanner(System.in);

        int b  = sc.nextInt();
        String bin = String.valueOf(b); // it will convert int b in string.

        boolean b1 = bin.matches("[01]*");
        System.out.println((b1 ? "Yesss binary " : "Not Binary"));

        int h = sc.nextInt();
        String hex = String.valueOf(h);

        boolean b2 = hex.matches("[0-9A-F]*");
        System.out.println((b2 ? "Yesss Hexa-decimal" : "Not Hexadecimal"));

        // checking date is valid or not
        // max date 31. So 1st Digit [0-3]    || Max month 12 so 1st Digit [01]     || year is 4 digit so [0-9]{4}
        //              So 2nd Digit [0-9]    ||              so 2nd Digit [0-9]

        String date = sc.nextLine();
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }

}