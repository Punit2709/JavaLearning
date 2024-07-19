package area;

import java.lang.*;
import java.uitl.Scanner;
import java.math.*;

public class Area
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a , b , c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        float s = (a + b + c) / 2;
        float area = math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area = " + area);

    }
}