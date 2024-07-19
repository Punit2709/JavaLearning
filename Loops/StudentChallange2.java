import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class StudentChallange2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        // Arithmetic Progression.
        // System.out.println("Enter Starting Value = ");
        // int a = sc.nextInt();

        // System.out.println("Enter Diff. Value = ");
        // int d = sc.nextInt();

        // System.out.println("Enter No.of Terms = ");
        // int n = sc.nextInt(); 

        // int term = a;
        // for (int i = 0; i < n; i++) {
        //     System.out.print(term + " , ");
        //     term = term + d;   
        // } 



        // Geometric Progression

        // System.out.println("Enter Starting Value = ");
        // int g = sc.nextInt();

        // System.out.println("Enter R Value = ");
        // int r = sc.nextInt();

        // System.out.println("Enter No.of Terms = ");
        // int t = sc.nextInt();

        // int Term = g;

        // for (int i = 0; i < t; i++) {
        //     System.out.print(Term + " , ");
        //     Term = Term*r;     
        // }


        //  Fibbonacci Series.

        int t1 = 0;
        int t2 = 1;
        System.out.println("Enter No.of term = ");
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.print(t1);
        }
        else if (n == 1) {
            System.out.print(t1 + " , " + t2 );   
        }

        else 
        {
            System.out.print(t1 + " , " + t2 + " , ");
            for (int i = 0 ; i < n - 2; i++) {

                int nextTerm = t1 + t2;
                System.out.print(nextTerm +  " , ");
                t1 = t2;
                t2 = nextTerm;   
            }
        }

    }

}