import java.lang.*;
import java.util.*;

public class StudentChallange
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number ");
        // int n = sc.nextInt();

        // // Counting Number of Digit
        // int count = 0;
        // while (n>0) {
        //     n = n/10;
        //     count++;
        // }
        // System.out.println("Number of Digit = " + count);

        
        // // Checking armstrong number.
        // System.out.println("Enter Number ");
        // int n1 = sc.nextInt();
        // int result = 0;
        // int temp = n1;
        // while (temp > 0) {

        //     int r = temp%10;
        //     result = result + (r)*(r)*(r);
        //     temp = temp/10;    
        // }
        // System.out.println((result == n1 ? "Yesss Armstrong " : "Not Armstrong"));


        // // Checking Number Is Palindrome Or Not.
        // System.out.println("Enter Number ");
        // int n2 = sc.nextInt();
        // int temp2 = n2;
        // int rev = 0;
        
        // while(temp2>0){

        //     int r = temp2 % 10;
        //     rev = rev*10 + r;
        //     temp2 = temp2 / 10;
        // }
        // System.out.println("Reverse Number = " + rev);
        // System.out.println((n2 ==rev ? "Yesss Palindrome " : "Not Planidrome"));
        

        // Display Digit In Words.
        // 1st reverse number and Store in String.
        // String Coz if n = 1700 in reverse 00 is not included so use String.

        int n3 = sc.nextInt();
        int temp3 = n3;
        String str = "";
        while(temp3>0){
            int r = temp3 % 10;
            temp3 = temp3 / 10;
            str = str + r;
        }
        System.out.println(str);

        char c;
        for (int i = str.length()-1; i >=0 ; i--) 
        {
             c = str.charAt(i);

            switch (c) {
                case '0': System.out.println("Zero");   break;

                case '1': System.out.println("One");    break;

                case '2': System.out.println("Two");    break;

                case '3': System.out.println("Three");  break;

                case '4': System.out.println("Four");   break;

                case '5': System.out.println("Five");   break;

                case '6': System.out.println("Six");    break;

                case '7': System.out.println("Seven");  break;

                case '8': System.out.println("Eight");  break;

                case '9': System.out.println("Nine");   break;

                default :  break;
            }
        }
    }
}