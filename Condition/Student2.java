import java.lang.*;
import java.util.*;

public class Student2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Here We are checking for Protocol and Type of Website

        String web = sc.nextLine();

        if (web.startsWith("https")) 
        {
            System.out.println("It Is Secure. https:// Prototype");
        }
        else if (web.startsWith("http")) 
        {
            System.out.println("It Is Not Secure. http:// Prototype");
        }
        else if (web.startsWith("ftp")) 
        {
            System.out.println("It Is ftp:// Prototype");
        }



        if (web.endsWith(".com"))
        {
            System.out.println("It is Commercial");
        }
        else if (web.endsWith(".gov"))
        {
            System.out.println("It is Goverment");
        }
        else if (web.endsWith(".org"))
        {
            System.out.println("It is Organization");
        }
        else if (web.endsWith(".net"))
        {
            System.out.println("It is Network");
        }


    }

}