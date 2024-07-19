import java.lang.*;
import java.util.*;

public class StudentChalenge1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        System.out.println("Enter The element Of An Array :-");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        int sum  = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Total of Elements = " + sum);


        // Finding Secong Largest Element.
        int max1 = a[0];
        int max2 = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max1)
            {
                max2 = max1;
                max1 = a[i];
            }

            else if(a[i] > max2 && a[i] < max1)
                max2 = a[i];
        }

        System.out.println("Second largest = " + max2);

    }

}