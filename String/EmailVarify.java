import java.lang.*;
import java.util.*;

public class EmailVarify
{
    public static void main(String[] args)
    {
        // task :- find Username and domain name.
       // punitsp@gmail.com :- 1). Username = punitsp   2). Domain = gmail.com
       
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

       int index = email.indexOf("@");

       String user = new String();
       String domain = new String();

       user =email.substring(0, index);
       domain = email.substring( index + 1, email.length());

       System.out.println("Username :- " + user );
       System.out.println("Domain :- " + domain );

    }

}