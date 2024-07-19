import java.lang.*;
import java.util.*;

public class StudChallenge1 {
    
    // 1. Find Number Is Prime Or Not.
    static boolean isPrime(int n) 
    {
        for (int i = 2; i < n / 2; i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    // 2. Finding GCD OR HCF
    static int Gcd(int a, int b){
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //System.out.println((isPrime(num) ? "YES" : "NOT"));
        if (isPrime(num)) 
        {
            System.out.println("Yess");
        }
        else
        {
            System.out.println("NO");
        }
        
        System.out.println(Gcd(120, 191));

    }

}